package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0004a implements u {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // j$.nio.file.attribute.u
    public final /* synthetic */ void b(E e) throws IOException {
        this.a.setOwner(D.a(e));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0004a) {
            obj = ((C0004a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.u
    public final /* synthetic */ E getOwner() {
        return C.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
