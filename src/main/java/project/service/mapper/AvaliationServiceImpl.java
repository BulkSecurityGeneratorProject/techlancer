//package project.service.mapper;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import project.domain.User;
//import project.repository.UserRepository;
//import project.service.AvaliationService;
//
//import static project.utils.Stars.*;
//
//@Service
//public class AvaliationServiceImpl implements AvaliationService {
//
//    private UserRepository userRepository;
//
//    public AvaliationServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void recommendUser(Long userId) {
//        User user = userRepository.getOne(userId);
//        Integer currentRecommendations = user.getAvaliation().getRecommendations();
//        user.getAvaliation().setRecommendations(currentRecommendations + 1);
//        validadeQntStars(user);
//        userRepository.save(user);
//    }
//
//    private void validadeQntStars(User user){
//        Integer currentRecommendations = user.getAvaliation().getRecommendations();
//        if (currentRecommendations >= ONE_STAR.getValue()){
//            user.getAvaliation().setQntStars(1);
//        } else if(currentRecommendations >= TWO_STAR.getValue()) {
//            user.getAvaliation().setQntStars(2);
//        }else if(currentRecommendations >= THREE_STAR.getValue()) {
//            user.getAvaliation().setQntStars(3);
//        }else if(currentRecommendations >= FOUR_STAR.getValue()) {
//            user.getAvaliation().setQntStars(4);
//        }else if(currentRecommendations >= FIVE_STAR.getValue()) {
//            user.getAvaliation().setQntStars(5);
//        }
//    }
//}
