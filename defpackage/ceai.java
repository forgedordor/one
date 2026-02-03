package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceai {
    final /* synthetic */ ceal b;
    private ceaj c = null;
    private ceaj d = null;
    int a = 0;

    public ceai(ceal cealVar) {
        this.b = cealVar;
    }

    final ceak a() {
        ceal cealVar = this.b;
        ceak ceakVar = new ceak(cealVar);
        ceakVar.a = cealVar.b;
        ceakVar.b = this.a;
        return ceakVar;
    }

    final void b() {
        ceaj ceajVar = this.d;
        ceajVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = ceajVar.a;
        int i = ceajVar.b;
        byteArrayOutputStream.getClass();
        this.b.c(byteArrayOutputStream.toByteArray(), i);
        this.d = null;
    }

    final void c() {
        if (this.d != null) {
            throw new RuntimeException("BUG: Invalid copy() before newbuf()");
        }
        ceaj ceajVar = new ceaj();
        ceal cealVar = this.b;
        ceajVar.a = cealVar.a;
        ceajVar.b = cealVar.b;
        ceajVar.c = this.c;
        this.c = ceajVar;
        this.a++;
        cealVar.a = new ByteArrayOutputStream();
        cealVar.b = 0;
    }

    final void d() {
        ceal cealVar = this.b;
        ByteArrayOutputStream byteArrayOutputStream = cealVar.a;
        int i = cealVar.b;
        ceaj ceajVar = this.c;
        ceajVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream2 = ceajVar.a;
        byteArrayOutputStream2.getClass();
        cealVar.a = byteArrayOutputStream2;
        cealVar.b = ceajVar.b;
        this.d = ceajVar;
        this.c = ceajVar.c;
        this.a--;
        ceaj ceajVar2 = this.d;
        ceajVar2.a = byteArrayOutputStream;
        ceajVar2.b = i;
    }
}
