# How_to_deploy_parcable_data

Don't forget dependencies add and java control version.

implementation 'org.parceler:parceler-api:1.1.12'
annotationProcessor 'org.parceler:parceler:1.1.12'


  compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }



