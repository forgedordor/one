package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfe {
    public static final ecnr a;

    static {
        ecnk ecnkVar = new ecnk();
        ecnkVar.c("\n        CREATE TABLE `usages` (\n          `type` TEXT NOT NULL,\n          `value` TEXT NOT NULL,\n          `context` TEXT NOT NULL,\n          `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n        )");
        ecnkVar.c("\n          CREATE INDEX `type` ON `usages`(`type`)\n          ");
        ecnkVar.c("\n        ALTER TABLE `usages` ADD COLUMN `search_term` TEXT DEFAULT NULL\n        ");
        ecnkVar.c("\n          CREATE INDEX `usages_type` ON `usages`(`type`)\n          ");
        a = ecnkVar.a();
    }

    public static final String a(String str) {
        String string = fdgn.x(str).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }
}
