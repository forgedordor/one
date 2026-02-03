package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eche implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        echf echfVar = new echf();
        echfVar.c();
        File fileA = echfVar.a(eceqVar);
        eleh.a(fileA);
        return new RandomAccessFile(fileA, "rw");
    }
}
