import { IMeta, NewMeta } from './meta.model';

export const sampleWithRequiredData: IMeta = {
  id: 17187,
};

export const sampleWithPartialData: IMeta = {
  id: 14505,
  valor: 17853,
};

export const sampleWithFullData: IMeta = {
  id: 32703,
  valor: 5776,
  area: 'LINGUAGENS_CODIGOS_E_SUAS_TECNOLOGIAS',
};

export const sampleWithNewData: NewMeta = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
