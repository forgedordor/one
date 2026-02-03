package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyth implements rti {
    final /* synthetic */ cytj a;
    final /* synthetic */ int b;

    public cyth(int i, cytj cytjVar) {
        this.b = i;
        this.a = cytjVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [bvqv, java.lang.Object] */
    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        obj.getClass();
        ruaVar.getClass();
        eksl ekslVar = (eksl) cytj.a.j();
        int i = this.b;
        ekslVar.t("Emoji code download failed, position: %s", bvqu.a(i));
        this.a.d.get().m(i, bvqo.EMOJI_DOWNLOAD_STATUS_ERROR);
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [bvqv, java.lang.Object] */
    @Override // defpackage.rti
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        obj2.getClass();
        ruaVar.getClass();
        rebVar.getClass();
        int i = this.b;
        cytj cytjVar = this.a;
        int i2 = i - 1;
        if (i2 == 0) {
            cytjVar.j = true;
        } else if (i2 != 1) {
            cytjVar.l = true;
        } else {
            cytjVar.k = true;
        }
        if (cytjVar.j && cytjVar.k && cytjVar.l) {
            cytjVar.b(8);
            cytjVar.d(0);
        }
        cytj.a.o().t("Emoji code download successfully, position: %s", bvqu.a(i));
        cytjVar.d.get().m(i, bvqo.EMOJI_DOWNLOAD_STATUS_DOWNLOADED);
        ((ains) cytjVar.h.b()).e("Bugle.Gaia.Verification.Prompt.Emoji.Download", 1);
        return false;
    }
}
