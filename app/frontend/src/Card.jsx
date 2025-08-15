// src/components/Card.js
import React from 'react';

const Card = ({ sightName, zone, category , photoURL, address, description}) => {
  return (
    <div>
      <img 
        src={photoURL}
      />
      <div className="p-6">
        <h3 className="text-xl font-bold text-gray-800">{sightName}</h3>
        <p className="text-gray-600 mb-4">{description}</p>
        <h3>{zone}</h3>
      </div>
    </div>
  );
};

export default Card;