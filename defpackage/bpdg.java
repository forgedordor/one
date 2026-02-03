package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpdg extends dqpg {
    public MessageIdType a;
    public String b;

    public bpdg() {
        super(bped.b().M());
        this.a = bary.a;
    }

    public final bpde a() {
        bpdf bpdfVar = new bpdf();
        bpdfVar.aD(aB());
        bpdfVar.a = this.a;
        bpdfVar.b = this.b;
        bpdfVar.cM = aC();
        return bpdfVar;
    }

    public final void b(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }
}
