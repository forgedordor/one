package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwai extends dwbh {
    public dwsg a;
    public dwbj b;
    private boolean c;
    private byte d;

    public dwai() {
    }

    @Override // defpackage.dwbh
    public final dwbk a() {
        dwbj dwbjVar;
        if (this.d == 1 && (dwbjVar = this.b) != null) {
            return new dwaj(this.a, this.c, dwbjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" skipNotification");
        }
        if (this.b == null) {
            sb.append(" oneOfType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwbh
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    @Override // defpackage.dwbh
    public final void c(dwbj dwbjVar) {
        this.b = dwbjVar;
    }

    public dwai(dwbk dwbkVar) {
        dwaj dwajVar = (dwaj) dwbkVar;
        this.a = dwajVar.a;
        this.c = dwajVar.b;
        this.b = dwajVar.c;
        this.d = (byte) 1;
    }
}
