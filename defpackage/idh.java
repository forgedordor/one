package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idh extends idn implements jsf, ifz {
    public final jso a;
    public final View b;
    public final jua c;
    public final String d;
    public final Rect e = new Rect();
    public AutofillId f;
    public cui g;
    public boolean h;
    public final idu i;

    public idh(idu iduVar, jso jsoVar, View view, jua juaVar, String str) {
        this.i = iduVar;
        this.a = jsoVar;
        this.b = view;
        this.c = juaVar;
        this.d = str;
        view.setImportantForAutofill(1);
        Object obj = jqg.a(view).a;
        if (obj == null) {
            itw.b("Required value was null.");
            throw new fcta();
        }
        this.f = iy$$ExternalSyntheticApiModelOutline1.m511m(obj);
        this.g = new cui((byte[]) null);
    }

    @Override // defpackage.ifz
    public final void a(igz igzVar, igz igzVar2) {
        jcr jcrVarD;
        jsc jscVarY;
        jcr jcrVarD2;
        jsc jscVarY2;
        if (igzVar != null && (jcrVarD2 = jbg.d(igzVar)) != null && (jscVarY2 = jcrVarD2.y()) != null && idi.a(jscVarY2)) {
            this.i.a.notifyViewExited(this.b, jcrVarD2.c);
        }
        if (igzVar2 == null || (jcrVarD = jbg.d(igzVar2)) == null || (jscVarY = jcrVarD.y()) == null || !idi.a(jscVarY)) {
            return;
        }
        int i = jcrVarD.c;
        this.c.a.b(i, new idf(this, i));
    }

    @Override // defpackage.jsf
    public final void b(jse jseVar, jsc jscVar) {
        juo juoVar;
        juo juoVar2;
        jsc jscVarY = jseVar.y();
        int i = ((jcr) jseVar).c;
        String str = null;
        String str2 = (jscVar == null || (juoVar2 = (juo) jsd.a(jscVar, jte.D)) == null) ? null : juoVar2.b;
        if (jscVarY != null && (juoVar = (juo) jsd.a(jscVarY, jte.D)) != null) {
            str = juoVar.b;
        }
        if (str2 != str) {
            if (str2 == null) {
                this.i.a(this.b, i, true);
            } else if (str == null) {
                this.i.a(this.b, i, false);
            } else if (fdbq.f((idj) jsd.a(jscVarY, jte.r), idq.a)) {
                this.i.a.notifyValueChanged(this.b, i, AutofillValue.forText(str));
            }
        }
        boolean z = jscVar != null && idi.b(jscVar);
        boolean z2 = jscVarY != null && idi.b(jscVarY);
        if (z != z2) {
            if (z2) {
                this.g.d(i);
            } else {
                this.g.e(i);
            }
        }
    }
}
