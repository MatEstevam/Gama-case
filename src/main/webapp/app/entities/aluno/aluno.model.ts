export interface IAluno {
  id: number;
  name?: string | null;
}

export type NewAluno = Omit<IAluno, 'id'> & { id: null };
