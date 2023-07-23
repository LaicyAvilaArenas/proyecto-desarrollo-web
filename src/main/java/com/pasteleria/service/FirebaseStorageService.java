package com.pasteleria.service; 

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "pasteleria-f6bcd.appspot.com";

    //Esta es la ruta básica de este proyecto pasteleria
    final String rutaSuperiorStorage = "pasteleria";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "pasteleria-f6bcd-firebase-adminsdk-zpf5n-04b70f19ba.json";
}
