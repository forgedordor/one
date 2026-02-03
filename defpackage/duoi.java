package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duoi implements duoc {
    private final Context a;
    private final dtvq b;
    private final ejwi c;
    private final dtpi d;

    public duoi(Context context, dtvq dtvqVar, ejwi ejwiVar, dtpi dtpiVar) {
        this.a = context;
        this.b = dtvqVar;
        this.c = ejwiVar;
        this.d = dtpiVar;
    }

    @Override // defpackage.duoc
    public final ListenableFuture a() {
        duuj.a(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return eork.i(null);
    }

    @Override // defpackage.duoc
    public final ListenableFuture c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        SharedPreferences sharedPreferencesA = duuj.a(context, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesA.getAll().keySet()) {
            try {
                arrayList.add(duui.a(str, context, this.b));
            } catch (duuh e) {
                durt.j(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                dtvq dtvqVar = this.b;
                ejxk.d("|").i(str).size();
                dtvqVar.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesA.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return eork.i(arrayList);
    }

    @Override // defpackage.duoc
    public final ListenableFuture d() {
        boolean z;
        int i;
        int i2;
        Context context = this.a;
        boolean z2 = false;
        if (!duiv.c(context)) {
            durt.b("%s Device isn't migrated to new file key, clear and set migration.", "SharedFilesMetadata");
            Context context2 = this.a;
            duiv.e(context2);
            duiv.d(context2, duiu.a(this.d.h()));
            return eork.i(false);
        }
        duiu duiuVarA = duiu.a(this.d.h());
        dtvq dtvqVar = this.b;
        duiu duiuVarA2 = duiv.a(context, dtvqVar);
        int i3 = duiuVarA.d;
        int i4 = duiuVarA2.d;
        int i5 = 1;
        if (i3 == i4) {
            z2 = true;
        } else {
            int i6 = 2;
            if (i3 < i4) {
                durt.i("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", duiuVarA2, duiuVarA);
                new Exception("Downgraded file key from " + String.valueOf(duiuVarA2) + " to " + String.valueOf(duiuVarA) + ".");
                dtvqVar.a();
                duiv.d(context, duiuVarA);
            } else {
                int i7 = i4 + 1;
                while (true) {
                    if (i7 <= i3) {
                        try {
                            duiu duiuVarA3 = duiu.a(i7);
                            int iOrdinal = duiuVarA3.ordinal();
                            z = z2;
                            int i8 = i3;
                            if (iOrdinal == i5) {
                                i = i7;
                                durt.b("%s: Starting migration to add download transform", "SharedFilesMetadata");
                                SharedPreferences sharedPreferencesA = duuj.a(context, "gms_icing_mdd_shared_files", this.c);
                                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                                for (String str : sharedPreferencesA.getAll().keySet()) {
                                    try {
                                        dtsd dtsdVarA = duui.a(str, context, dtvqVar);
                                        dtsh dtshVar = (dtsh) duuj.c(sharedPreferencesA, str, dtsh.a.getParserForType());
                                        if (dtshVar == null) {
                                            durt.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit.remove(str);
                                        } else {
                                            duuj.f(editorEdit, str);
                                            duuj.g(editorEdit, duui.e(dtsdVarA), dtshVar);
                                        }
                                    } catch (duuh unused) {
                                        durt.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                        this.b.a();
                                        editorEdit.remove(str);
                                    }
                                }
                                if (!editorEdit.commit()) {
                                    durt.f("Failed to commit migration metadata to disk");
                                    dtvq dtvqVar2 = this.b;
                                    new Exception("Migrate to DownloadTransform failed.");
                                    dtvqVar2.a();
                                    break;
                                }
                                duiv.d(this.a, duiu.a(i));
                                i7 = i + 1;
                                z2 = z;
                                i3 = i8;
                                i5 = 1;
                                i6 = 2;
                            } else {
                                if (iOrdinal != i6) {
                                    throw new UnsupportedOperationException("Upgrade to version " + duiuVarA3.name() + "not supported!");
                                }
                                durt.b("%s: Starting migration to dedup on checksum only", "SharedFilesMetadata");
                                Context context3 = this.a;
                                SharedPreferences sharedPreferencesA2 = duuj.a(context3, "gms_icing_mdd_shared_files", this.c);
                                SharedPreferences.Editor editorEdit2 = sharedPreferencesA2.edit();
                                for (String str2 : sharedPreferencesA2.getAll().keySet()) {
                                    try {
                                        dtsd dtsdVarA2 = duui.a(str2, context3, this.b);
                                        i2 = i7;
                                        dtsh dtshVar2 = (dtsh) duuj.c(sharedPreferencesA2, str2, dtsh.a.getParserForType());
                                        if (dtshVar2 == null) {
                                            durt.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit2.remove(str2);
                                        } else {
                                            duuj.f(editorEdit2, str2);
                                            duuj.g(editorEdit2, duui.d(dtsdVarA2), dtshVar2);
                                        }
                                    } catch (duuh unused2) {
                                        i2 = i7;
                                        durt.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                        this.b.a();
                                        editorEdit2.remove(str2);
                                    }
                                    i7 = i2;
                                }
                                i = i7;
                                if (!editorEdit2.commit()) {
                                    durt.f("Failed to commit migration metadata to disk");
                                    dtvq dtvqVar3 = this.b;
                                    new Exception("Migrate to ChecksumOnly failed.");
                                    dtvqVar3.a();
                                    break;
                                }
                                duiv.d(this.a, duiu.a(i));
                                i7 = i + 1;
                                z2 = z;
                                i3 = i8;
                                i5 = 1;
                                i6 = 2;
                            }
                        } finally {
                            Context context4 = this.a;
                            dtvq dtvqVar4 = this.b;
                            if (duiv.a(context4, dtvqVar4).d != duiuVarA.d && !duiv.d(context4, duiuVarA)) {
                                durt.f(a.I(duiuVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                new Exception(a.I(duiuVarA, "Fail to set target version ", "."));
                                dtvqVar4.a();
                            }
                        }
                    } else {
                        z2 = true;
                    }
                }
                Context context5 = this.a;
                dtvq dtvqVar5 = this.b;
                if (duiv.a(context5, dtvqVar5).d != duiuVarA.d && !duiv.d(context5, duiuVarA)) {
                    durt.f(a.I(duiuVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                    new Exception(a.I(duiuVarA, "Fail to set target version ", "."));
                    dtvqVar5.a();
                }
                z2 = z;
            }
        }
        return eork.i(Boolean.valueOf(z2));
    }

    @Override // defpackage.duoc
    public final ListenableFuture e(final dtsd dtsdVar) {
        return eika.j(f(new ekph(dtsdVar)), new ejvr() { // from class: duoh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (dtsh) ((ekgp) obj).get(dtsdVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.duoc
    public final ListenableFuture f(ekhx ekhxVar) {
        Context context = this.a;
        SharedPreferences sharedPreferencesA = duuj.a(context, "gms_icing_mdd_shared_files", this.c);
        ekgi ekgiVar = new ekgi();
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            dtsd dtsdVar = (dtsd) ekqgVarListIterator.next();
            dtsh dtshVar = (dtsh) duuj.c(sharedPreferencesA, duui.b(dtsdVar, context, this.b), dtsh.a.getParserForType());
            if (dtshVar != null) {
                ekgiVar.i(dtsdVar, dtshVar);
            }
        }
        return eork.i(ekgiVar.b());
    }

    @Override // defpackage.duoc
    public final ListenableFuture g(dtsd dtsdVar) {
        Context context = this.a;
        ejwi ejwiVar = this.c;
        return eork.i(Boolean.valueOf(duuj.h(duuj.a(context, "gms_icing_mdd_shared_files", ejwiVar), duui.b(dtsdVar, context, this.b))));
    }

    @Override // defpackage.duoc
    public final ListenableFuture h(dtsd dtsdVar, dtsh dtshVar) {
        Context context = this.a;
        ejwi ejwiVar = this.c;
        return eork.i(Boolean.valueOf(duuj.i(duuj.a(context, "gms_icing_mdd_shared_files", ejwiVar), duui.b(dtsdVar, context, this.b), dtshVar)));
    }
}
