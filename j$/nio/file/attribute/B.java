package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class B implements q {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
