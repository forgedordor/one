package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baco extends baim {
    private final int a;
    private final SelfIdentityId b;
    private final Uri c;
    private final Uri d;
    private final String e;
    private final int f;
    private final String g;

    public baco(int i, SelfIdentityId selfIdentityId, Uri uri, Uri uri2, String str, int i2, String str2) {
        this.a = i;
        this.b = selfIdentityId;
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.c = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null selectedIconUri");
        }
        this.d = uri2;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.e = str;
        this.f = i2;
        this.g = str2;
    }

    @Override // defpackage.baim
    public final int a() {
        return this.f;
    }

    @Override // defpackage.baim
    public final int b() {
        return this.a;
    }

    @Override // defpackage.baim
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.baim
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.baim
    public final SelfIdentityId e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof baim) {
            baim baimVar = (baim) obj;
            if (this.a == baimVar.b() && this.b.equals(baimVar.e()) && this.c.equals(baimVar.c()) && this.d.equals(baimVar.d()) && this.e.equals(baimVar.g()) && this.f == baimVar.a() && ((str = this.g) != null ? str.equals(baimVar.f()) : baimVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.baim
    public final String f() {
        return this.g;
    }

    @Override // defpackage.baim
    public final String g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        String str = this.g;
        return (((iHashCode * 1000003) ^ this.f) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SelfIdentityEntry{subId=" + this.a + ", selfParticipantId=" + ((SelfIdentityIdImpl) this.b).a + ", iconUri=" + this.c.toString() + ", selectedIconUri=" + this.d.toString() + ", displayName=" + this.e + ", displayColor=" + this.f + ", displayDestination=" + this.g + "}";
    }
}
