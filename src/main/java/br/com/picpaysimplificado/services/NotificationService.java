package br.com.picpaysimplificado.services;

import br.com.picpaysimplificado.domain.user.User;
import br.com.picpaysimplificado.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest =  new NotificationDTO(email,message);

        System.out.println("Notificação enviada para o usuário");

//        ResponseEntity<String> notificatonResponse = this.restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);
//
//        if (!(notificatonResponse.getStatusCode() == HttpStatus.OK)) {
//            System.out.println("Error ao enviar a notificação");
//            throw new Exception("Seriço de notificação está fora do ar");
//        }
    }
}
