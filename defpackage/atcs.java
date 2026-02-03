package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atcs extends atdl {
    public String a;
    public String b;
    public String e;
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();

    @Override // defpackage.atdl
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.e = str;
    }

    @Override // defpackage.atdl
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null realm");
        }
        this.b = str;
    }

    @Override // defpackage.atdl
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null schema");
        }
        this.a = str;
    }
}
