package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import androidx.car.app.model.Alert;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjd implements TextWatcher {
    public final dnkk a;
    public boolean c;
    private final fdjx e;
    private final fdap f;
    private final fdap g;
    private int h;
    private int i;
    public List b = new ArrayList();
    public fdjx d = a();
    private final List j = new ArrayList();
    private final List k = new ArrayList();

    public dnjd(fdjx fdjxVar, dnkk dnkkVar, fdap fdapVar, fdap fdapVar2) {
        this.e = fdjxVar;
        this.a = dnkkVar;
        this.f = fdapVar;
        this.g = fdapVar2;
    }

    private final void d(CharSequence charSequence, fdat fdatVar) {
        fdil.d(this.d, null, null, new dnjc(this, charSequence.toString(), fdatVar, null), 3);
    }

    public final fdjx a() {
        return fdjy.b(this.e.hE().plus(new fdlt(null)));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        int i = this.i;
        int i2 = this.h;
        if (i > 0) {
            int i3 = i2 + i;
            dnif[] dnifVarArr = (dnif[]) editable.getSpans(i2, i3, dnif.class);
            dnifVarArr.getClass();
            if (dnifVarArr.length == 0) {
                CharSequence charSequenceD = lok.b().d(editable, i2, i3, Alert.DURATION_SHOW_INDEFINITELY, 1);
                charSequenceD.getClass();
                Iterator itA = fdbd.a(((Spannable) charSequenceD).getSpans(i2, i3, lop.class));
                while (itA.hasNext()) {
                    Object obj = (lop) itA.next();
                    final int spanStart = editable.getSpanStart(obj);
                    final CharSequence charSequenceSubSequence = editable.subSequence(spanStart, editable.getSpanEnd(obj));
                    List list = this.k;
                    final fdap fdapVar = new fdap() { // from class: dniw
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            fcvv fcvvVar = (fcvv) obj2;
                            fcvvVar.getClass();
                            boolean z = false;
                            if (fcvvVar.a == spanStart) {
                                if (fdbq.f(fcvvVar.b, charSequenceSubSequence)) {
                                    z = true;
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    if (!Collection.EL.removeIf(list, new Predicate() { // from class: dnix
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) fdapVar.invoke(obj2)).booleanValue();
                        }
                    })) {
                        d(charSequenceSubSequence, new dnjb(this));
                    }
                }
            } else {
                Iterator itA2 = fdbd.a(dnifVarArr);
                while (itA2.hasNext()) {
                    dnif dnifVar = (dnif) itA2.next();
                    final int spanStart2 = editable.getSpanStart(dnifVar);
                    final dnnp dnnpVar = dnifVar.a;
                    List list2 = this.j;
                    final fdap fdapVar2 = new fdap() { // from class: dniy
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            fcvv fcvvVar = (fcvv) obj2;
                            fcvvVar.getClass();
                            boolean z = false;
                            if (fcvvVar.a == spanStart2) {
                                if (fdbq.f(fcvvVar.b, dnnpVar)) {
                                    z = true;
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    if (!Collection.EL.removeIf(list2, new Predicate() { // from class: dniz
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) fdapVar2.invoke(obj2)).booleanValue();
                        }
                    })) {
                        b(this.b, dnnpVar);
                    }
                }
            }
        }
        List list3 = this.j;
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            c(this.b, (dnnp) ((fcvv) it.next()).b);
        }
        list3.clear();
        List list4 = this.k;
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            d((CharSequence) ((fcvv) it2.next()).b, new dnja(this));
        }
        list4.clear();
        this.c = false;
    }

    public final void b(List list, dnnp dnnpVar) {
        synchronized (list) {
            list.add(dnnpVar);
        }
        this.f.invoke(dnnpVar);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object next;
        charSequence.getClass();
        List list = this.j;
        list.clear();
        List list2 = this.k;
        list2.clear();
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null || i2 <= 0 || this.c) {
            return;
        }
        int i4 = i2 + i;
        Iterator itA = fdbd.a(spannable.getSpans(i, i4, dnif.class));
        while (itA.hasNext()) {
            dnif dnifVar = (dnif) itA.next();
            list.add(new fcvv(spannable.getSpanStart(dnifVar), dnifVar.a));
        }
        Iterator itA2 = fdbd.a(spannable.getSpans(i, i4, lop.class));
        while (itA2.hasNext()) {
            lop lopVar = (lop) itA2.next();
            int spanStart = spannable.getSpanStart(lopVar);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((fcvv) next).a == spanStart) {
                        break;
                    }
                }
            }
            if (next == null) {
                list2.add(new fcvv(spanStart, spannable.subSequence(spanStart, spannable.getSpanEnd(lopVar))));
            }
        }
    }

    public final void c(List list, dnnp dnnpVar) {
        synchronized (list) {
            list.remove(dnnpVar);
        }
        this.g.invoke(dnnpVar);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        this.h = i;
        this.i = i3;
    }
}
