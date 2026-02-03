package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drov extends drqx {
    private final dron a;
    private final ekgb b;
    private final Optional c;
    private final drob e;
    private final eosc f;
    private final Optional h;
    private final Optional i;
    private final boolean d = true;
    private final boolean g = true;

    public drov(dron dronVar, ekgb ekgbVar, Optional optional, boolean z, drob drobVar, eosc eoscVar, boolean z2, Optional optional2, Optional optional3) {
        this.a = dronVar;
        this.b = ekgbVar;
        this.c = optional;
        this.e = drobVar;
        this.f = eoscVar;
        this.h = optional2;
        this.i = optional3;
    }

    @Override // defpackage.drqx
    public final drob a() {
        return this.e;
    }

    @Override // defpackage.drqx
    public final dron b() {
        return this.a;
    }

    @Override // defpackage.drqx
    public final ekgb c() {
        return this.b;
    }

    @Override // defpackage.drqx
    public final eosc d() {
        return this.f;
    }

    @Override // defpackage.drqx
    public final Optional e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof drqx) {
            drqx drqxVar = (drqx) obj;
            if (dron.a(drqxVar.b()) && ((ekgbVar = this.b) != null ? ekjz.h(ekgbVar, drqxVar.c()) : drqxVar.c() == null) && this.c.equals(drqxVar.g())) {
                drqxVar.j();
                drqxVar.i();
                if (this.e.equals(drqxVar.a()) && this.f.equals(drqxVar.d())) {
                    drqxVar.h();
                    if (this.h.equals(drqxVar.e()) && this.i.equals(drqxVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.drqx
    public final Optional f() {
        return this.i;
    }

    @Override // defpackage.drqx
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.drqx
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ekgb ekgbVar = this.b;
        return (((((((((((((((iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode())) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ 1231) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1231) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.drqx
    public final boolean i() {
        return true;
    }

    public final String toString() {
        Optional optional = this.i;
        Optional optional2 = this.h;
        eosc eoscVar = this.f;
        drob drobVar = this.e;
        Optional optional3 = this.c;
        ekgb ekgbVar = this.b;
        return "EmojiPickerDataOptions{emojiPickerCoreDataOptions=" + this.a.toString() + ", recentEmojiProviders=" + String.valueOf(ekgbVar) + ", pageableItemProvider=" + optional3.toString() + ", imageLoader=null, stickyVariantsEnabled=true, emojiVariantsController=" + String.valueOf(drobVar) + ", backgroundExecutor=" + String.valueOf(eoscVar) + ", saveToRecentAfterCommit=true, availableEmojis=" + optional2.toString() + ", emojiBlockList=" + optional.toString() + "}";
    }

    @Override // defpackage.drqx
    public final void j() {
    }
}
