package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chak {
    public static final chbe a(bspj bspjVar) {
        bspjVar.aA(0, "work_id");
        cgzx cgzxVar = bspjVar.a;
        cgzxVar.getClass();
        bspjVar.aA(1, "pipeline_type");
        cgxy cgxyVar = bspjVar.b;
        cgxyVar.getClass();
        bspjVar.aA(7, "payload");
        byte[] bArr = bspjVar.h;
        bspjVar.aA(2, "sequencing_key");
        String str = bspjVar.c;
        bspjVar.aA(6, "client_supplied_id");
        String str2 = bspjVar.g;
        bspjVar.aA(3, "insertion_timestamp");
        Instant instant = bspjVar.d;
        instant.getClass();
        bspjVar.aA(5, "execution_state");
        cgzv cgzvVar = bspjVar.f;
        cgzvVar.getClass();
        bspjVar.aA(4, "execution_attempt_count");
        int i = (int) bspjVar.e;
        bspjVar.aA(8, "execute_after_timestamp");
        Instant instant2 = bspjVar.i;
        instant2.getClass();
        return new chbe(cgzxVar, cgxyVar, bArr, str, str2, instant, cgzvVar, i, instant2);
    }
}
