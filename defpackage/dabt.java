package defpackage;

import j$.util.stream.Stream;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabt {
    private final adap a;

    public dabt(adap adapVar) {
        this.a = adapVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor, bcut] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.database.Cursor, bcut] */
    public final dabv a(bxwt bxwtVar, String str) {
        ekgb ekgbVar;
        dabn dabnVar = new dabn();
        int i = ekgb.d;
        ekgb ekgbVar2 = ekoe.a;
        dabnVar.d(ekgbVar2);
        dabnVar.b(ekgbVar2);
        dabnVar.c(ekon.a);
        Stream.Builder builder = Stream.CC.builder();
        ?? r2 = ((bxtv) bxwtVar.b()).a;
        try {
            r2.di();
            while (r2.moveToNext()) {
                builder.add(this.a.a(acyx.ak(r2), new HashMap(), ""));
            }
            r2.close();
            dabnVar.d((ekgb) builder.build().collect(ekcv.a));
            if (bxwtVar.a().c()) {
                ekgbVar = ekoe.a;
            } else {
                Stream.Builder builder2 = Stream.CC.builder();
                r2 = ((bxtv) bxwtVar.a()).a;
                try {
                    r2.di();
                    while (r2.moveToNext()) {
                        builder2.add(this.a.a(acyx.ak(r2), new HashMap(), str));
                    }
                    r2.close();
                    ekgbVar = (ekgb) builder2.build().collect(ekcv.a);
                } finally {
                }
            }
            dabnVar.b(ekgbVar);
            dabnVar.c(((bxtv) bxwtVar.a()).b);
            return dabnVar.a();
        } finally {
        }
    }
}
