package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class s implements u {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.u
    public final /* synthetic */ void b(E e) throws IOException {
        this.a.setOwner(D.a(e));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof s) {
            obj = ((s) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
