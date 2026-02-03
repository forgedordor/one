package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cokm extends dqpg {
    public MessageIdType a;
    public String b;
    public comc c;
    public aucl d;
    public aucj e;
    public aucj f;
    public String g;
    public byte[] h;

    public cokm() {
        super(comb.g());
        this.a = bary.a;
    }

    public final cokk a() {
        cokl coklVar = new cokl();
        coklVar.aD(aB());
        coklVar.a = this.a;
        coklVar.b = this.b;
        coklVar.c = this.c;
        coklVar.d = this.d;
        coklVar.e = this.e;
        coklVar.f = this.f;
        coklVar.g = this.g;
        coklVar.h = this.h;
        coklVar.cM = aC();
        return coklVar;
    }

    public final void b(aucj aucjVar) {
        int i = this.aB;
        if (i < 55030) {
            dqru.x("file_information", i);
        }
        aE(4);
        this.e = aucjVar;
    }

    public final void c(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void d(byte[] bArr) {
        int i = this.aB;
        if (i < 56040) {
            dqru.x("opaque_data", i);
        }
        aE(7);
        this.h = bArr;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(comc comcVar) {
        aE(2);
        this.c = comcVar;
    }
}
