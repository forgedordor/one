package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edhh implements lxk {
    private final edlu a;
    private final edlk b;
    private final edlc c;
    private final ejwi d;

    public edhh(ejwi ejwiVar, edlu edluVar, edlk edlkVar, edlc edlcVar) {
        this.a = edluVar;
        this.b = edlkVar;
        this.c = edlcVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        if (!cls.isAssignableFrom(edhg.class)) {
            throw new IllegalArgumentException("Unknown model class ".concat(cls.toString()));
        }
        ejwi ejwiVar = this.d;
        edlu edluVar = this.a;
        edlk edlkVar = this.b;
        edlc edlcVar = this.c;
        ejwi ejwiVarB = ejwiVar.b(new ejvr() { // from class: edhf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new edid((edhy) obj);
            }
        });
        edlf edlfVar = new edlf(edluVar);
        edln edlnVar = new edln(edluVar);
        edlv edlvVar = new edlv(edluVar);
        edlh edlhVar = (edlh) edlkVar.a.b();
        edlhVar.getClass();
        eosc eoscVar = (eosc) edlkVar.b.b();
        eoscVar.getClass();
        edhj edhjVar = (edhj) edlkVar.c.b();
        edhjVar.getClass();
        edgi edgiVar = (edgi) edlkVar.d.b();
        edgiVar.getClass();
        edgv edgvVar = (edgv) edlkVar.e.b();
        edgvVar.getClass();
        edlj edljVar = new edlj(edlhVar, eoscVar, edhjVar, edgiVar, edgvVar);
        Context context = (Context) edlcVar.a.b();
        context.getClass();
        eosc eoscVar2 = (eosc) edlcVar.b.b();
        eoscVar2.getClass();
        return (lxd) cls.cast(new edhb(ejwiVarB, edlfVar, edlnVar, edlvVar, edljVar, new edlb(context, eoscVar2)));
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd b(Class cls, lyp lypVar) {
        return lxj.c(this, cls);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
