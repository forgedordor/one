package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@fdac
/* loaded from: classes2.dex */
public final class wwa implements Spanned {
    private final Spanned a;

    public static final cilq a(Spanned spanned) {
        Object[] spans = spanned.getSpans(0, spanned.length(), wvf.class);
        spans.getClass();
        List listM = fcur.M(spans);
        ArrayList<wvf> arrayList = new ArrayList();
        for (Object obj : listM) {
            if (!((wvf) obj).a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (wvf wvfVar : arrayList) {
            arrayList2.add(new cilo(spanned.getSpanStart(wvfVar), spanned.getSpanEnd(wvfVar), wvfVar.b));
        }
        List listAl = fcva.al(arrayList2, new wvz());
        if (true == listAl.isEmpty()) {
            listAl = null;
        }
        if (listAl != null) {
            return new cilq(listAl);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.a.charAt(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wwa) && fdbq.f(this.a, ((wwa) obj).a);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.a.getSpans(i, i2, cls);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ int length() {
        return this.a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
