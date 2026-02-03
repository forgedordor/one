package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpe implements afoo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl");
    public static final djcq b = new djcq(fcvo.a, new fdap() { // from class: afoq
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return fctx.a;
        }
    }, new fdap() { // from class: afor
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return fctx.a;
        }
    }, new fdap() { // from class: afos
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return fctx.a;
        }
    });
    public final fdjx c;
    public final wre d;
    public final wkk e;
    public final Map f;
    private final fdvc g;

    public afpe(fdjx fdjxVar, wre wreVar, wkk wkkVar, wjc wjcVar) {
        fdjxVar.getClass();
        wreVar.getClass();
        wjcVar.getClass();
        this.c = fdjxVar;
        this.d = wreVar;
        this.e = wkkVar;
        this.f = new LinkedHashMap();
        afoy afoyVar = new afoy(wjcVar.f, this);
        afov afovVar = new afov(null, this);
        int i = fdsn.a;
        this.g = fdtg.b(new fdwg(afovVar, afoyVar), fdjxVar, fdur.b, b);
    }

    @Override // defpackage.afoo
    public final fdvc a() {
        return this.g;
    }
}
