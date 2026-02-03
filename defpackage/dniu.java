package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dniu implements dnjm, dnjn {
    public final dngc a;
    public final EditText b;
    public final Set c = new LinkedHashSet();
    public final dnjd d;
    private final /* synthetic */ dnip e;
    private final dnga f;
    private final dnji g;
    private final dnje h;
    private final dnjh i;

    public dniu(dnga dngaVar, dnji dnjiVar, dnje dnjeVar, dngc dngcVar, EditText editText) {
        this.e = new dnip(editText);
        this.f = dngaVar;
        this.g = dnjiVar;
        this.h = dnjeVar;
        this.a = dngcVar;
        this.b = editText;
        dnjh dnjhVarA = dngaVar != null ? dnjiVar.a(dngaVar, null) : null;
        this.i = dnjhVarA;
        dnis dnisVar = new dnis(this);
        dnit dnitVar = new dnit(this);
        fdjx fdjxVar = (fdjx) dnjeVar.a.b();
        fdjxVar.getClass();
        dnkk dnkkVar = (dnkk) dnjeVar.b.b();
        dnkkVar.getClass();
        this.d = new dnjd(fdjxVar, dnkkVar, dnisVar, dnitVar);
        if (dnjhVarA != null) {
            m(dnjhVarA);
        }
        lok lokVarB = lok.b();
        lokVarB.getClass();
        fdap fdapVar = new fdap() { // from class: dnir
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lok) obj).getClass();
                dniu dniuVar = this.a;
                dnjd dnjdVar = dniuVar.d;
                dnjdVar.getClass();
                dniuVar.b.addTextChangedListener(dniuVar.a.h(dnjdVar));
                return fctx.a;
            }
        };
        int iA = lokVarB.a();
        if (iA != 0) {
            if (iA == 1) {
                fdapVar.invoke(lokVarB);
                return;
            } else if (iA != 3) {
                return;
            }
        }
        lokVarB.f(new dnns(fdapVar, lokVarB));
    }

    @Override // defpackage.dnih
    public final dnjo a() {
        return this.e.a();
    }

    @Override // defpackage.dnih
    public final CharSequence b(boolean z) {
        return this.e.b(z);
    }

    @Override // defpackage.dnih
    public final void c(CharSequence charSequence) {
        this.e.c(charSequence);
    }

    @Override // defpackage.dnih
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.dnih
    public final void e() {
        this.e.a.getText().clear();
    }

    @Override // defpackage.dnih
    public final void f(dnnp dnnpVar) {
        this.e.f(dnnpVar);
    }

    @Override // defpackage.dnih
    public final void g(CharSequence charSequence) {
        this.e.g(charSequence);
    }

    @Override // defpackage.dnih
    public final void h() {
        List listAo;
        dnjd dnjdVar = this.d;
        synchronized (dnjdVar.b) {
            listAo = fcva.ao(dnjdVar.b);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dnhm) it.next()).b(listAo);
        }
        dnjd dnjdVar2 = this.d;
        dnjdVar2.c = true;
        fdjy.e(dnjdVar2.d, null);
        dnjdVar2.d = dnjdVar2.a();
        dnjdVar2.b = new ArrayList();
    }

    @Override // defpackage.dnih
    public final void i(fddq fddqVar, CharSequence charSequence) {
        this.e.i(fddqVar, charSequence);
    }

    @Override // defpackage.dnih
    public final void j(dnjo dnjoVar) {
        this.e.j(dnjoVar);
    }

    @Override // defpackage.dnih
    public final void k(CharSequence charSequence) {
        this.e.k(charSequence);
    }

    @Override // defpackage.dnjm
    public final void l(dnjl dnjlVar) {
        boolean z = dnjlVar instanceof dnjk;
        final dnip dnipVar = this.e;
        if (z) {
            dnip.o(dnjlVar, dnipVar.c, new fdae() { // from class: dnil
                @Override // defpackage.fdae
                public final Object invoke() {
                    dnip dnipVar2 = dnipVar;
                    if (dnipVar2.d == null) {
                        EditText editText = dnipVar2.a;
                        dnio dnioVar = new dnio(dnipVar2);
                        editText.addTextChangedListener(dnioVar);
                        dnipVar2.d = dnioVar;
                    }
                    return fctx.a;
                }
            });
        } else {
            if (!(dnjlVar instanceof dnjj)) {
                throw new fctg();
            }
            dnip.o(dnjlVar, dnipVar.b, new fdae() { // from class: dnim
                @Override // defpackage.fdae
                public final Object invoke() {
                    final dnip dnipVar2 = dnipVar;
                    if (dnipVar2.e == null) {
                        InputFilter inputFilter = new InputFilter() { // from class: dnin
                            @Override // android.text.InputFilter
                            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                                charSequence.getClass();
                                spanned.getClass();
                                Iterator it = dnipVar2.b.iterator();
                                while (it.hasNext()) {
                                    ((dnjj) it.next()).b(charSequence, i, i2, spanned, i3, i4);
                                }
                                return null;
                            }
                        };
                        dnipVar2.e = inputFilter;
                        EditText editText = dnipVar2.a;
                        InputFilter[] filters = editText.getFilters();
                        filters.getClass();
                        editText.setFilters((InputFilter[]) dnge.a(filters, inputFilter));
                    }
                    return fctx.a;
                }
            });
        }
    }

    @Override // defpackage.dniq
    public final void m(dnhm dnhmVar) {
        this.c.add(dnhmVar);
    }

    @Override // defpackage.dnjm
    public final void n(dnjl dnjlVar) {
        boolean z = dnjlVar instanceof dnjk;
        final dnip dnipVar = this.e;
        if (z) {
            dnip.p(dnjlVar, dnipVar.c, new fdae() { // from class: dnij
                @Override // defpackage.fdae
                public final Object invoke() {
                    dnip dnipVar2 = dnipVar;
                    TextWatcher textWatcher = dnipVar2.d;
                    if (textWatcher != null) {
                        dnipVar2.a.removeTextChangedListener(textWatcher);
                        dnipVar2.d = null;
                    }
                    return fctx.a;
                }
            });
        } else {
            if (!(dnjlVar instanceof dnjj)) {
                throw new fctg();
            }
            dnip.p(dnjlVar, dnipVar.b, new fdae() { // from class: dnik
                @Override // defpackage.fdae
                public final Object invoke() {
                    dnip dnipVar2 = dnipVar;
                    InputFilter inputFilter = dnipVar2.e;
                    if (inputFilter != null) {
                        EditText editText = dnipVar2.a;
                        InputFilter[] filters = editText.getFilters();
                        filters.getClass();
                        int iE = fcur.E(filters, inputFilter);
                        if (iE >= 0) {
                            int length = filters.length - 1;
                            InputFilter[] inputFilterArr = new InputFilter[length];
                            int i = 0;
                            while (i < length) {
                                int i2 = i + 1;
                                inputFilterArr[i] = i < iE ? filters[i] : filters[i2];
                                i = i2;
                            }
                            filters = inputFilterArr;
                        }
                        editText.setFilters(filters);
                        dnipVar2.e = null;
                    }
                    return fctx.a;
                }
            });
        }
    }

    @Override // defpackage.dniq
    public final void o(dnhm dnhmVar) {
        this.c.remove(dnhmVar);
    }
}
