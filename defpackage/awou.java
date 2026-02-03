package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awou {
    public static final awpx a(awso awsoVar) {
        awsoVar.getClass();
        String str = awsoVar.b;
        str.getClass();
        UUID uuidFromString = UUID.fromString(str);
        uuidFromString.getClass();
        return new awpx(uuidFromString);
    }

    public static final awso b(awpx awpxVar) {
        awpxVar.getClass();
        awsn awsnVar = (awsn) awso.a.createBuilder();
        awsnVar.getClass();
        awsp.b(awpxVar.a(), awsnVar);
        return awsp.a(awsnVar);
    }
}
