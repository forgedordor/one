package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ailj extends ailn {
    public aimo a;
    public int b;
    private ellg c;
    private aioj d;
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();

    @Override // defpackage.ailn
    public final ailn a(ellg ellgVar) {
        if (ellgVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = ellgVar;
        return this;
    }

    @Override // defpackage.ailn
    public final ailo b() {
        aioj aiojVar;
        int i;
        aimo aimoVar;
        ellg ellgVar = this.c;
        if (ellgVar != null && (aiojVar = this.d) != null && (i = this.b) != 0 && (aimoVar = this.a) != null) {
            return new ailk(ellgVar, aiojVar, i, this.e, aimoVar, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" event");
        }
        if (this.d == null) {
            sb.append(" logSpec");
        }
        if (this.b == 0) {
            sb.append(" logPurpose");
        }
        if (this.a == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ailn
    public final aimo c() {
        aimo aimoVar = this.a;
        if (aimoVar != null) {
            return aimoVar;
        }
        throw new IllegalStateException("Property \"logger\" has not been set");
    }

    @Override // defpackage.ailn
    public final void d(emxt emxtVar) {
        this.g = Optional.of(emxtVar);
    }

    @Override // defpackage.ailn
    public final void e(aioj aiojVar) {
        if (aiojVar == null) {
            throw new NullPointerException("Null logSpec");
        }
        this.d = aiojVar;
    }

    @Override // defpackage.ailn
    public final void f(ainn ainnVar) {
        this.f = Optional.of(ainnVar);
    }

    @Override // defpackage.ailn
    public final void g(Optional optional) {
        this.e = optional;
    }
}
