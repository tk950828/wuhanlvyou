 function addActive(obj){
        var nodeLi = obj.parentNode;
        // alert(nodeLi.className);
        // alert(obj.parentNode.nodeName);
        $("li a").removeClass("active");
        // alert(nodeLi.className);
        // nodeLi.className = "active";
        obj.className = "active";
    }