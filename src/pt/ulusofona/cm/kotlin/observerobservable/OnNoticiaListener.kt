package pt.ulusofona.cm.kotlin.observerobservable

interface OnNoticiaListener : Registavel{

    public fun onReceiveNoticia(noticia : String)

}