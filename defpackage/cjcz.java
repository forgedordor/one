package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjcz extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjlm cjlmVar = (cjlm) obj;
        auia auiaVar = (auia) auib.a.createBuilder();
        if ((cjlmVar.b & 1) != 0) {
            String str = cjlmVar.c;
            auiaVar.copyOnWrite();
            auib auibVar = (auib) auiaVar.instance;
            str.getClass();
            auibVar.b |= 1;
            auibVar.c = str;
        }
        return (auib) auiaVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        auib auibVar = (auib) obj;
        cjll cjllVar = (cjll) cjlm.a.createBuilder();
        if ((auibVar.b & 1) != 0) {
            String str = auibVar.c;
            cjllVar.copyOnWrite();
            cjlm cjlmVar = (cjlm) cjllVar.instance;
            str.getClass();
            cjlmVar.b |= 1;
            cjlmVar.c = str;
        }
        return (cjlm) cjllVar.build();
    }
}
