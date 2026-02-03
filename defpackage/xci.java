package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xci implements xbl, vwn, wqe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl");
    public final fdjx b;
    public final wre c;
    public final fduf d;
    public ahat e;
    public String f;
    public boolean g;
    public final djmn h;
    private final Context i;
    private final ahax j;
    private final dkep k;
    private final djwc l;

    /* JADX WARN: Multi-variable type inference failed */
    public xci(Context context, fdjx fdjxVar, wre wreVar, ahax ahaxVar) {
        context.getClass();
        fdjxVar.getClass();
        wreVar.getClass();
        ahaxVar.getClass();
        this.i = context;
        this.b = fdjxVar;
        this.c = wreVar;
        this.j = ahaxVar;
        this.d = fdvf.a(false);
        this.f = "";
        String string = context.getString(R.string.subject_urgent_text_field_hint);
        string.getClass();
        this.k = new dkep(string, this.f, new fdae() { // from class: xbo
            @Override // defpackage.fdae
            public final Object invoke() {
                xci xciVar = this.a;
                xciVar.f = "";
                ahat ahatVar = xciVar.e;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                ahatVar.b(xciVar.d(xciVar.h));
                return fctx.a;
            }
        }, new fdap() { // from class: xbp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                xci xciVar = this.a;
                xciVar.f = str;
                ahat ahatVar = xciVar.e;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                ahatVar.b(xciVar.d(xciVar.h));
                return fctx.a;
            }
        });
        String string2 = context.getString(R.string.subject_urgent_urgent_checkbox);
        string2.getClass();
        djwc djwcVar = new djwc(string2, null, null, this.g, true, new fdae() { // from class: xbq
            @Override // defpackage.fdae
            public final Object invoke() {
                xci xciVar = this.a;
                xciVar.g = !xciVar.g;
                ahat ahatVar = xciVar.e;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                ahatVar.b(xciVar.d(xciVar.h));
                return fctx.a;
            }
        }, null, 0, 198);
        this.l = djwcVar;
        String string3 = context.getString(R.string.subject_urgent_dialog_title);
        string3.getClass();
        List listB = fcva.b(djwcVar);
        String string4 = context.getString(R.string.subject_urgent_dialog_dismiss);
        string4.getClass();
        dktq dktqVar = new dktq(string4, new fdae() { // from class: xbr
            @Override // defpackage.fdae
            public final Object invoke() {
                ahat ahatVar = this.a.e;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                ahatVar.a();
                return fctx.a;
            }
        });
        String string5 = context.getString(R.string.subject_urgent_dialog_confirm);
        string5.getClass();
        this.h = new djmn(string3, listB, null, null, null, null == true ? 1 : 0, new dktq(string5, new fdae() { // from class: xbs
            @Override // defpackage.fdae
            public final Object invoke() {
                final xci xciVar = this.a;
                final String str = xciVar.f;
                ahat ahatVar = null;
                if (str.length() == 0) {
                    str = null;
                }
                xciVar.c.c(new fdap() { // from class: xbn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        vvw vvwVar = (vvw) obj;
                        vvwVar.getClass();
                        return vvw.c(vvwVar, null, null, str, xciVar.g, null, null, false, 0, null, 2035);
                    }
                });
                ahat ahatVar2 = xciVar.e;
                if (ahatVar2 == null) {
                    fdbq.c("popupController");
                } else {
                    ahatVar = ahatVar2;
                }
                ahatVar.a();
                return fctx.a;
            }
        }), dktqVar, new fdae() { // from class: xbt
            @Override // defpackage.fdae
            public final Object invoke() {
                ahat ahatVar = this.a.e;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                ahatVar.a();
                return fctx.a;
            }
        }, 60);
    }

    @Override // defpackage.wqe
    public final void a() {
        this.d.f(false);
    }

    @Override // defpackage.xbl
    public final fdvc b() {
        return fdtg.b(new fdua(fdqq.a(new xbw(this.c.a, this)), this.d, new xbx(this, null)), this.b, fdur.b, null);
    }

    public final djfy c(String str, boolean z) {
        if (z) {
            if (str == null || str.length() == 0) {
                str = this.i.getString(R.string.subject_urgent_urgent);
                str.getClass();
            } else {
                String string = this.i.getString(R.string.subject_urgent_subject_template);
                string.getClass();
                str = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                str.getClass();
            }
        } else if (str == null) {
            str = "";
        }
        return new djfy(str, z, new xby(this), new xbz(this), new xca(this), new xcb(this));
    }

    public final djmn d(djmn djmnVar) {
        return djmn.b(djmnVar, null, fcva.g(dkep.a(this.k, this.f, null, null, 29), djwc.a(this.l, null, null, null, this.g, null, null, 247)), null, null, null, null, 509);
    }

    @Override // defpackage.vwn
    public final void fu() {
        ekrw ekrwVarF = a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl", "show", 123, "SubjectUrgentUiAdapterImpl.kt")).q("Showing subject/urgent dialog");
        fdvc fdvcVar = this.c.a;
        String str = ((vvw) fdvcVar.c()).c;
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.g = ((vvw) fdvcVar.c()).d;
        this.j.d(true, new fdap() { // from class: xbm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                xci xciVar = this.a;
                xciVar.e = ahatVar;
                return xciVar.d(xciVar.h);
            }
        });
    }
}
