package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdr extends ejvj {
    @Override // defpackage.ejvj
    public final /* synthetic */ Object a(Object obj) throws cgzt {
        ewsz ewszVar = (ewsz) obj;
        if ((ewszVar.b & 1) == 0) {
            Class<?> cls = ewszVar.getClass();
            int i = fdcj.a;
            throw new cgzt(new fdbi(ezjj.class), new fdbi(cls));
        }
        ezjj ezjjVar = ewszVar.c;
        if (ezjjVar == null) {
            ezjjVar = ezjj.a;
        }
        ezjjVar.getClass();
        return new chdn(ezjjVar);
    }

    @Override // defpackage.ejvj
    public final /* synthetic */ Object b(Object obj) throws cgzt {
        chdq chdqVar = (chdq) obj;
        if (!(chdqVar instanceof chdn)) {
            Class<?> cls = chdqVar.getClass();
            int i = fdcj.a;
            throw new cgzt(new fdbi(chdn.class), new fdbi(cls));
        }
        ewsy ewsyVar = (ewsy) ewsz.a.createBuilder();
        ewsyVar.getClass();
        ezjj ezjjVar = ((chdn) chdqVar).a;
        ewsyVar.copyOnWrite();
        ewsz ewszVar = (ewsz) ewsyVar.instance;
        ewszVar.c = ezjjVar;
        ewszVar.b |= 1;
        evsn evsnVarBuild = ewsyVar.build();
        evsnVarBuild.getClass();
        return (ewsz) evsnVarBuild;
    }
}
