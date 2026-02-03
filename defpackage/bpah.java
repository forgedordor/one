package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpah extends dqpg {
    public String a;
    public String b;

    public bpah() {
        super(bpbc.a().M());
    }

    public final bpaf a() {
        bpag bpagVar = new bpag();
        bpagVar.aD(aB());
        bpagVar.a = this.a;
        bpagVar.b = this.b;
        bpagVar.cM = aC();
        return bpagVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }
}
