/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONSerializer;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.imp.NewImp;
import com.entity.News;
import com.yourcompany.struts.form.NewsPageForm;

/**
 * MyEclipse Struts Creation date: 03-02-2017
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/news" name="newsForm" input="/form/news.jsp"
 *                scope="request" validate="true"
 * @struts.action-forward name="success" path="/successJsp.jsp"
 */
public class NewsAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		NewsPageForm newsForm = (NewsPageForm) form;// TODO Auto-generated
													// method stub
//		System.out.println(newsForm.getPageNum());
		// 设定默认的每页显示条数
		int pageSize = 5;
		// 设定默认的页码数
		int pageIndex = Integer.parseInt(newsForm.getPageNum());
		NewImp n = new NewImp();
		int count = n.getNewsCount();
		int pageCount = 0;
		if (count % pageSize == 0) {
			pageCount = count / pageSize;
		} else {
			pageCount = count / pageSize + 1;
		}
		List<News> nlist = n.getNewsList(pageSize, pageIndex);
		// System.out.println(nlist.get(0).getId());
		String jsonString = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", nlist);
		map.put("page", pageCount);
		jsonString = JSONSerializer.toJSON(map).toString();
		System.out.println(jsonString);
		request.setAttribute("data", jsonString);
		return mapping.findForward("success");
	}
}