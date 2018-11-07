//package project.web.rest;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import project.service.AvaliationService;
//
//@RestController
//@RequestMapping("avaliation")
//public class AvaliationResource {
//
//    private AvaliationService avaliationService;
//
//    public AvaliationResource(AvaliationService avaliationService) {
//        this.avaliationService = avaliationService;
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> recommendUser(@RequestParam Long userId){
//        avaliationService.recommendUser(userId);
//        return ResponseEntity.ok().build();
//
//    }
//
//}
