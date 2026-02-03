package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtce extends dtch {
    final /* synthetic */ dtcg a;

    public dtce(dtcg dtcgVar) {
        this.a = dtcgVar;
    }

    @Override // defpackage.dtch
    public final void b(dtcd dtcdVar) {
        dtcg dtcgVar = this.a;
        cvw cvwVar = dtcgVar.b;
        if (((Boolean) cvwVar.get(dtcdVar)).booleanValue()) {
            return;
        }
        cvwVar.put(dtcdVar, true);
        dtcgVar.c++;
        dtcgVar.a();
    }
}
