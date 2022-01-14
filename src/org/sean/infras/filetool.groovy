package org.sean.infras.utils

class FileTool implements Serializable { 

    Object pipeline

    /**
     * Constructor
     *
     * @param pipeline A reference to the pipeline in a pipeline to give access to them in the shared library.
     */
    FileTool(Object pipeline) { this.pipeline = pipeline }



    Object readPropertiesConfig(String path) {
        def propConfigString = pipeline.libraryResource path
        // E.g.'org/mastercard/pipeline/alberta/backend/environmentconfig.yml' - for backend.
        def propConfigData = pipeline.readJSON text: envConfigString
        return propConfigData
    }

    
}
