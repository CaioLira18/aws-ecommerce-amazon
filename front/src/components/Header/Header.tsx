import React from 'react'
import { SearchBar } from '../SearchBar/SearchBar'

export const Header = () => {
  return (
    <div className="header">
      <div className="headerContainer">
        <div className="headerLeftLogos">
          <div className="barLogo">
            <img src="https://amazon-project-images.s3.us-east-1.amazonaws.com/logos/menu.png" alt="" />
          </div>
          <div className="header-amazonLogo">
            <img src="https://amazon-project-images.s3.us-east-1.amazonaws.com/logos/logo.png" alt="" />
            <span>.com.br</span>
          </div>

          <div className="headerLocation">
            <svg viewBox="0 0 24 24" className="headerLocationPin">
              <path
                d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5A2.5 2.5 0 1 1 12 6.5a2.5 2.5 0 0 1 0 5z"
                fill="currentColor"
              />
            </svg>
            <div className="headerLocationText">
              <span>Enviar para Endereco</span>
              <strong>Recife 53370480</strong>
            </div>
          </div>
        </div>

        <SearchBar />

        <div className="headerRight">
          <div className="headerOption">
            <span>Olá, Nome</span>
            <strong>
              Contas e Listas
              <svg viewBox="0 0 12 8" className="headerOptionArrow">
                <path d="M1 1L6 6L11 1" stroke="currentColor" strokeWidth="1.5" fill="none" strokeLinecap="round" strokeLinejoin="round" />
              </svg>
            </strong>
          </div>

          <div className="headerOption">
            <span>Devoluções</span>
            <strong>e Pedidos</strong>
          </div>

          <div className="headerOption headerCart">
            <div className="headerCartIconWrapper">
              <svg viewBox="0 0 24 24" className="headerCartIcon">
                <path
                  d="M4 4h2l2.4 12.02A2 2 0 0 0 10.36 18h7.28a2 2 0 0 0 1.96-1.58L21 8H6"
                  stroke="currentColor"
                  strokeWidth="1.8"
                  fill="none"
                  strokeLinecap="round"
                  strokeLinejoin="round"
                />
                <circle cx="10" cy="21" r="1.4" fill="currentColor" />
                <circle cx="18" cy="21" r="1.4" fill="currentColor" />
              </svg>
              <span className="headerCartBadge">1</span>
            </div>
            <strong>Carrinho</strong>
          </div>
        </div>
      </div>
    </div>
  )
}
