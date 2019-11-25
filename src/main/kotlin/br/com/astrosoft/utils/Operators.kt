package br.com.astrosoft.utils

fun <T: Any> T.IN(vararg itens: T): Boolean {
  val list = itens.toList()
  return list.contains(this)
}
