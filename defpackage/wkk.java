package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiDataConverter");
    private static final Set g;
    public final Context b;
    public final fcyh c;
    public final dluu d;
    public final apql e;
    public final aqkb f;
    private final fdjx h;
    private final bxfa i;
    private final wlg j;
    private final fcsu k;
    private final whl l;
    private final aqhi m;
    private final fctc n;

    static {
        int i = fdcj.a;
        g = fcwm.d(new fdbi(dojr.class), new fdbi(doju.class), new fdbi(dojp.class), new fdbi(dlto.class), new fdbi(doav.class), new fdbi(dnvg.class));
    }

    public wkk(Context context, fdjx fdjxVar, fcyh fcyhVar, bxfa bxfaVar, wlg wlgVar, dluu dluuVar, apql apqlVar, fcsu fcsuVar, whl whlVar, aqkb aqkbVar, final eygg eyggVar, aqhi aqhiVar) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        wlgVar.getClass();
        dluuVar.getClass();
        apqlVar.getClass();
        fcsuVar.getClass();
        eyggVar.getClass();
        this.b = context;
        this.h = fdjxVar;
        this.c = fcyhVar;
        this.i = bxfaVar;
        this.j = wlgVar;
        this.d = dluuVar;
        this.e = apqlVar;
        this.k = fcsuVar;
        this.l = whlVar;
        this.f = aqkbVar;
        this.m = aqhiVar;
        this.n = fctd.a(new fdae() { // from class: wjz
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = wkk.a;
                return (vth) eyggVar.b();
            }
        });
    }

    static /* synthetic */ fdpl b(wkk wkkVar, dltd dltdVar) {
        return wkkVar.d(dltdVar, null, null);
    }

    public static final boolean c(vvs vvsVar) {
        vvsVar.getClass();
        if (vvsVar instanceof vvr) {
            return e(((vvr) vvsVar).a);
        }
        if (vvsVar instanceof vvn) {
            return e(((vvn) vvsVar).b);
        }
        if (vvsVar instanceof vvo) {
            return true;
        }
        if (vvsVar instanceof vvm) {
            return e(((vvm) vvsVar).b);
        }
        throw new fctg();
    }

    private final fdpl d(dltd dltdVar, Uri uri, dike dikeVar) {
        if (dltdVar instanceof dojr) {
            Uri uri2 = Uri.parse(doij.b((dohs) dltdVar, new dogm(3)).f());
            uri2.getClass();
            return new fdpu(new dilf(uri2, uri, this.l.a((dltn) dltdVar), dikeVar));
        }
        byte[] bArr = null;
        if (dltdVar instanceof doju) {
            Uri uri3 = Uri.parse(doij.b((dohs) dltdVar, new dogo(bArr)).f());
            uri3.getClass();
            return new fdpu(new dilj(uri3, uri, this.l.a((dltn) dltdVar), dikeVar));
        }
        if (!(dltdVar instanceof dojp)) {
            if (dltdVar instanceof doav) {
                Uri uri4 = Uri.parse(((doau) doij.a((dohr) dltdVar, new dogm(3))).b);
                uri4.getClass();
                return new fdpu(new dilf(uri4, uri, ((doav) dltdVar).d(), dikeVar));
            }
            if (dltdVar instanceof dnvg) {
                Uri uri5 = Uri.parse(((dnvg) dltdVar).b);
                uri5.getClass();
                return new fdpu(new dilf(uri5, uri, this.l.a((dltn) dltdVar), dikeVar));
            }
            if (!(dltdVar instanceof dlto)) {
                throw new IllegalStateException("Attachment isConvertible, but no case for it exists");
            }
            dlto dltoVar = (dlto) dltdVar;
            String strA = dltoVar.a.a();
            if (!le.y(strA)) {
                return new fdui(new wkg(dltoVar, this, strA, ynn.a(strA), dikeVar, null));
            }
            bxfa bxfaVar = this.i;
            Uri uri6 = uri == null ? Uri.parse(dltoVar.b) : uri;
            uri6.getClass();
            return fdtg.b(new wkj(bxfaVar.a(uri6), this, dikeVar), this.h, fdur.a(1000L, 2), new dikx(""));
        }
        wlg wlgVar = this.j;
        dojp dojpVar = (dojp) dltdVar;
        String str = dojpVar.b;
        Duration duration = dojpVar.e;
        Uri uri7 = Uri.parse(str);
        uri7.getClass();
        final yov yovVarA = wlgVar.d.a(uri7, duration, 2);
        final fduf fdufVarA = fdvf.a(null);
        final fduf fdufVarA2 = fdvf.a(false);
        List listG = fcva.g(yovVarA.f(), yovVarA.e(), yovVarA.c(), yovVarA.b(), fdufVarA);
        fdae fdaeVar = new fdae() { // from class: wku
            @Override // defpackage.fdae
            public final Object invoke() {
                fduf fdufVar = fdufVarA;
                Float f = (Float) fdufVar.c();
                yov yovVar = yovVarA;
                if (f != null) {
                    yovVar.l(f.floatValue());
                }
                fduf fdufVar2 = fdufVarA2;
                fdufVar.f(null);
                if (((Boolean) fdufVar2.c()).booleanValue()) {
                    yovVar.h();
                    fdufVar2.f(false);
                }
                return fctx.a;
            }
        };
        long j = fdhi.a;
        Object objB = wlgVar.c.b();
        objB.getClass();
        long jG = fdhk.g(((Number) objB).longValue(), fdhl.c);
        fdpl[] fdplVarArr = (fdpl[]) fcva.ao(listG).toArray(new fdpl[0]);
        int length = fdplVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = false;
        }
        int length2 = fdplVarArr.length;
        ArrayList arrayList = new ArrayList(length2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            arrayList.add(new fdtm(fdplVarArr[i2], new wkx(zArr, i3, null)));
            i2++;
            i3++;
        }
        return new fdqz(new wlc(wlgVar.b, jG, fdplVarArr, zArr, null), new wla((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0]), wlgVar, dojpVar, fdaeVar, dikeVar, yovVarA, fdufVarA2, fdufVarA));
    }

    private static final boolean e(dltd dltdVar) {
        Set set = g;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (fdab.a((fddy) it.next()).isAssignableFrom(dltdVar.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final fdpl a(vvs vvsVar) {
        dike dikeVar;
        vvsVar.getClass();
        if (!c(vvsVar)) {
            throw new IllegalArgumentException(a.h(vvsVar, "Cannot convert ", " to AttachmentUiData"));
        }
        if (!(vvsVar instanceof vvr)) {
            if (vvsVar instanceof vvn) {
                return b(this, ((vvn) vvsVar).b);
            }
            if (vvsVar instanceof vvo) {
                return new wke(((ygs) this.k.b()).a(), this, vvsVar);
            }
            if (vvsVar instanceof vvm) {
                return b(this, ((vvm) vvsVar).b);
            }
            throw new fctg();
        }
        final vvr vvrVar = (vvr) vvsVar;
        dltd dltdVar = vvrVar.a;
        vvq vvqVar = vvrVar.b;
        if (this.m.a()) {
            Object objA = this.n.a();
            objA.getClass();
            final vth vthVar = (vth) objA;
            dikeVar = new dike(vvrVar.c, new fdae() { // from class: wka
                @Override // defpackage.fdae
                public final Object invoke() {
                    vthVar.d(vvrVar.c);
                    return fctx.a;
                }
            }, new fdae() { // from class: wkb
                @Override // defpackage.fdae
                public final Object invoke() {
                    vthVar.c(vvrVar.c);
                    return fctx.a;
                }
            });
        } else {
            dikeVar = null;
        }
        return d(dltdVar, vvqVar.c, dikeVar);
    }
}
