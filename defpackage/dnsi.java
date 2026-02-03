package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsi implements dpxz {
    final /* synthetic */ dnsj a;

    public dnsi(dnsj dnsjVar) {
        this.a = dnsjVar;
    }

    @Override // defpackage.dpxz
    public final void a() {
        dnsj dnsjVar = this.a;
        fdlr fdlrVar = dnsjVar.h;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        dnsjVar.i = null;
        dnsjVar.f.invoke();
    }

    @Override // defpackage.dpxz
    public final void b() {
        dnsj dnsjVar = this.a;
        if (dnsjVar.g == null) {
            dnsjVar.g = fdil.d(dnsjVar.c, null, null, new dnsg(dnsjVar, null), 3);
            return;
        }
        ekrd ekrdVar = (ekrd) dnsj.a.i();
        ekrdVar.Z(eksk.MEDIUM);
        ((ekrd) ekrdVar.h("com/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer$resultsRenderer$1", "enable", 50, "EmojiSearchRenderer.kt")).q("ResultsRenderer.enable should only be called once!");
    }

    @Override // defpackage.dpxz
    public final void c(String str) {
        dnsj dnsjVar = this.a;
        fdlr fdlrVar = dnsjVar.h;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        dnsjVar.h = fdil.d(dnsjVar.c, null, null, new dnsh(this, dnsjVar, str, null), 3);
    }
}
