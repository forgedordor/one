package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duof implements dugs {
    public final Executor a;
    private final Context b;
    private final dtvq c;
    private final ejwi d;
    private final duag e;

    public duof(Context context, duag duagVar, dtvq dtvqVar, ejwi ejwiVar, Executor executor) {
        this.b = context;
        this.e = duagVar;
        this.c = dtvqVar;
        this.d = ejwiVar;
        this.a = executor;
    }

    @Override // defpackage.dugs
    public final ListenableFuture a(dtqy dtqyVar) {
        durt.c("%s: Adding file group %s", "SharedPreferencesFileGroupsMetadata", dtqyVar.d);
        dtqy dtqyVarD = dutx.d(dtqyVar, (this.e.a() / 1000) + dtqyVar.l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dtqyVarD);
        return m(arrayList);
    }

    @Override // defpackage.dugs
    public final ListenableFuture b() {
        Context context = this.b;
        ejwi ejwiVar = this.d;
        duuj.a(context, "gms_icing_mdd_groups", ejwiVar).edit().clear().commit();
        duuj.a(context, "gms_icing_mdd_group_key_properties", ejwiVar).edit().clear().commit();
        return k();
    }

    @Override // defpackage.dugs
    public final ListenableFuture c() {
        return eika.k(d(), new eooz() { // from class: duoe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    duof duofVar = this.a;
                    if (!it.hasNext()) {
                        return dvat.a(arrayList).b(new eooy() { // from class: duod
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                ArrayList arrayList2 = new ArrayList();
                                int i = 0;
                                while (true) {
                                    List list2 = list;
                                    if (i >= list2.size()) {
                                        return eork.i(arrayList2);
                                    }
                                    List list3 = arrayList;
                                    dtrw dtrwVar = (dtrw) list2.get(i);
                                    dtqy dtqyVar = (dtqy) eork.q((Future) list3.get(i));
                                    if (dtqyVar != null) {
                                        arrayList2.add(new duol(dtrwVar, dtqyVar));
                                    }
                                    i++;
                                }
                            }
                        }, duofVar.a);
                    }
                    arrayList.add(duofVar.g((dtrw) it.next()));
                }
            }
        }, this.a);
    }

    @Override // defpackage.dugs
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferencesA = duuj.a(this.b, "gms_icing_mdd_groups", this.d);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesA.getAll().keySet()) {
            try {
                arrayList.add(dutz.a(str));
            } catch (duty e) {
                durt.j(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                this.c.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesA.edit();
                }
                editorEdit.remove(str);
                durt.b("%s: Deleting null file group ", "SharedPreferencesFileGroupsMetadata");
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return eork.i(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // defpackage.dugs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture e() throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r7.b
            ejwi r2 = r7.d
            java.io.File r1 = defpackage.dutz.b(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5c
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5c
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4d
            int r1 = (int) r5     // Catch: java.lang.IllegalArgumentException -> L4d
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.IllegalArgumentException -> L4d
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.io.IOException -> L3a
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.io.IOException -> L3a
            r5.read(r1)     // Catch: java.io.IOException -> L3a
            r1.rewind()     // Catch: java.io.IOException -> L3a
            java.lang.Class<dtqy> r5 = defpackage.dtqy.class
            dtqy r6 = defpackage.dtqy.a     // Catch: java.io.IOException -> L3a
            evuo r6 = r6.getParserForType()     // Catch: java.io.IOException -> L3a
            java.util.List r1 = defpackage.duug.b(r1, r5, r6)     // Catch: java.io.IOException -> L3a
            r2.close()     // Catch: java.io.IOException -> L38
            goto L46
        L38:
            r2 = move-exception
            goto L3d
        L3a:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L3d:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.durt.k(r2, r0, r4)
        L46:
            if (r1 != 0) goto L69
            int r0 = defpackage.ekgb.d
            ekgb r1 = defpackage.ekoe.a
            goto L69
        L4d:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.durt.k(r1, r0, r2)
            int r0 = defpackage.ekgb.d
            ekgb r1 = defpackage.ekoe.a
            goto L69
        L5c:
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r1 = "File %s not found while reading."
            defpackage.durt.b(r1, r0)
            int r0 = defpackage.ekgb.d
            ekgb r1 = defpackage.ekoe.a
        L69:
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duof.e():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.dugs
    public final ListenableFuture f() {
        return eorv.a;
    }

    @Override // defpackage.dugs
    public final ListenableFuture g(dtrw dtrwVar) {
        Context context = this.b;
        return eork.i((dtqy) duuj.c(duuj.a(context, "gms_icing_mdd_groups", this.d), dutz.c(dtrwVar), dtqy.a.getParserForType()));
    }

    @Override // defpackage.dugs
    public final ListenableFuture h(dtrw dtrwVar) {
        Context context = this.b;
        return eork.i((dtry) duuj.c(duuj.a(context, "gms_icing_mdd_group_key_properties", this.d), dutz.c(dtrwVar), dtry.a.getParserForType()));
    }

    @Override // defpackage.dugs
    public final ListenableFuture i(dtrw dtrwVar) {
        Context context = this.b;
        ejwi ejwiVar = this.d;
        return eork.i(Boolean.valueOf(duuj.h(duuj.a(context, "gms_icing_mdd_groups", ejwiVar), dutz.c(dtrwVar))));
    }

    @Override // defpackage.dugs
    public final ListenableFuture j(List list) {
        SharedPreferences.Editor editorEdit = duuj.a(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dtrw dtrwVar = (dtrw) it.next();
            durt.d("%s: Removing group %s %s", "SharedPreferencesFileGroupsMetadata", dtrwVar.c, dtrwVar.d);
            editorEdit.remove(duuj.e(dtrwVar));
        }
        return eork.i(Boolean.valueOf(editorEdit.commit()));
    }

    @Override // defpackage.dugs
    public final ListenableFuture k() {
        n().delete();
        return eorv.a;
    }

    @Override // defpackage.dugs
    public final ListenableFuture l(dtrw dtrwVar, dtqy dtqyVar) {
        Context context = this.b;
        ejwi ejwiVar = this.d;
        return eork.i(Boolean.valueOf(duuj.i(duuj.a(context, "gms_icing_mdd_groups", ejwiVar), dutz.c(dtrwVar), dtqyVar)));
    }

    @Override // defpackage.dugs
    public final ListenableFuture m(List list) throws IOException {
        File fileN = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileN, true);
            try {
                ByteBuffer byteBufferA = duug.a(list);
                if (byteBufferA != null) {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(byteBufferA);
                }
                fileOutputStream.close();
                return eork.i(true);
            } catch (IOException unused) {
                durt.f("IOException occurred while writing file groups.");
                return eork.i(false);
            }
        } catch (FileNotFoundException unused2) {
            durt.g("File %s not found while writing.", fileN.getAbsolutePath());
            return eork.i(false);
        }
    }

    final File n() {
        return dutz.b(this.b, this.d);
    }
}
