package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxry extends cqdj {
    public final String a;
    private final iy b;
    private final cqjy c;

    public cxry(String str, Activity activity, String str2, cqjy cqjyVar) {
        super(str);
        this.b = (iy) activity;
        this.a = str2;
        this.c = cqjyVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String[] list = this.c.b(this.b.getApplicationContext()).list(new FilenameFilter() { // from class: cxrx
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                String str2 = this.a.a;
                boolean zEquals = str2.equals("email");
                boolean zEndsWith = str.endsWith("_email");
                if (str2.equals("email") && str.startsWith("db_copy")) {
                    return true;
                }
                if (str.startsWith("mmsdump-") && zEquals == zEndsWith) {
                    return true;
                }
                return str.startsWith("smsdump-");
            }
        });
        list.getClass();
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, java.lang.String[]] */
    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ?? r6 = (String[]) obj;
        if (r6 == 0 || r6.length <= 0) {
            return;
        }
        fr frVarA = this.b.a();
        new cg(frVarA);
        String str = this.a;
        cxca cxcaVar = new cxca();
        Bundle bundle = new Bundle();
        bundle.putSerializable("dump_files", r6);
        bundle.putString(GroupManagementRequest.ACTION_TAG, str);
        cxcaVar.at(bundle);
        cxcaVar.t(frVarA, "");
    }
}
