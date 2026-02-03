package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes9.dex */
public final /* synthetic */ class t implements FileOwnerAttributeView {
    public final /* synthetic */ u a;

    public final /* synthetic */ boolean equals(Object obj) {
        u uVar = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return uVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return D.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(C.a(userPrincipal));
    }
}
