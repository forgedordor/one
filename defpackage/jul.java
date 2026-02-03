package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jul implements Appendable {
    public final List a;
    private final StringBuilder b;
    private final List c;

    public jul() {
        this((byte[]) null);
    }

    public final int a(jxx jxxVar) {
        juk jukVar = new juk(jxxVar, this.b.length(), 0, null, 12);
        this.c.add(jukVar);
        this.a.add(jukVar);
        return r8.size() - 1;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.b.append(c);
        return this;
    }

    public final juo b() {
        StringBuilder sb = this.b;
        String string = sb.toString();
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((juk) list.get(i)).a(sb.length()));
        }
        return new juo(string, arrayList);
    }

    public final void c(jvn jvnVar, int i, int i2) {
        this.a.add(new juk(jvnVar, i, i2, null, 8));
    }

    public final void d(jxx jxxVar, int i, int i2) {
        this.a.add(new juk(jxxVar, i, i2, null, 8));
    }

    public final void e(juo juoVar) {
        StringBuilder sb = this.b;
        int length = sb.length();
        sb.append(juoVar.b);
        List list = juoVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jum jumVar = (jum) list.get(i);
                this.a.add(new juk(jumVar.a, jumVar.b + length, jumVar.c + length, jumVar.d));
            }
        }
    }

    public final void f(String str) {
        this.b.append(str);
    }

    public final void g() {
        List list = this.c;
        if (list.isEmpty()) {
            kfq.c("Nothing to pop.");
        }
        ((juk) list.remove(list.size() - 1)).a = this.b.length();
    }

    public final void h(int i) {
        List list = this.c;
        if (i >= list.size()) {
            kfq.c(i + " should be less than " + list.size());
        }
        while (list.size() - 1 >= i) {
            g();
        }
    }

    public final void i(String str, String str2) {
        juk jukVar = new juk(new jya(str2), this.b.length(), 0, str, 4);
        List list = this.c;
        list.add(jukVar);
        this.a.add(jukVar);
        list.size();
    }

    public /* synthetic */ jul(byte[] bArr) {
        this.b = new StringBuilder(16);
        this.c = new ArrayList();
        this.a = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof juo) {
            e((juo) charSequence);
            return this;
        }
        this.b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof juo) {
            juo juoVar = (juo) charSequence;
            StringBuilder sb = this.b;
            String str = juoVar.b;
            int length = sb.length();
            sb.append((CharSequence) str, i, i2);
            List listA = jur.a(juoVar, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jum jumVar = (jum) listA.get(i3);
                    this.a.add(new juk(jumVar.a, jumVar.b + length, jumVar.c + length, jumVar.d));
                }
            }
            return this;
        }
        this.b.append(charSequence, i, i2);
        return this;
    }

    public jul(juo juoVar) {
        this((byte[]) null);
        e(juoVar);
    }

    public jul(String str) {
        this((byte[]) null);
        f(str);
    }
}
