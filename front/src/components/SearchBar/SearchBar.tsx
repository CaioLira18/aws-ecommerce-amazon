import React from 'react'

export const SearchBar = () => {
  return (
    <div className="searchBar">
      <button className="searchBarCategory" type="button">
        <span>Todos</span>
        <svg viewBox="0 0 12 8" className="searchBarCategoryArrow">
          <path d="M1 1L6 6L11 1" stroke="currentColor" strokeWidth="1.5" fill="none" strokeLinecap="round" strokeLinejoin="round" />
        </svg>
      </button>

      <input
        className="searchBarInput"
        type="text"
        placeholder="Pesquisar Amazon.com.br"
      />

      <button className="searchBarButton" type="button" aria-label="Pesquisar">
        <svg viewBox="0 0 24 24" className="searchBarButtonIcon">
          <circle cx="10.5" cy="10.5" r="6.5" stroke="#0F1111" strokeWidth="2.2" fill="none" />
          <line x1="15.5" y1="15.5" x2="21" y2="21" stroke="#0F1111" strokeWidth="2.2" strokeLinecap="round" />
        </svg>
      </button>
    </div>
  )
}
