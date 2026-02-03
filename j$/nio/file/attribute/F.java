package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes9.dex */
public final /* synthetic */ class F {
    public final /* synthetic */ UserPrincipalLookupService a;

    public F(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
