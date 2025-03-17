import { IAluno, NewAluno } from './aluno.model';

export const sampleWithRequiredData: IAluno = {
  id: 8806,
};

export const sampleWithPartialData: IAluno = {
  id: 22223,
  name: 'wetly',
};

export const sampleWithFullData: IAluno = {
  id: 25732,
  name: 'oof near likewise',
};

export const sampleWithNewData: NewAluno = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
