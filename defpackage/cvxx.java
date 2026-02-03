package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxx implements cvxp {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final ekgb d;
    private final String e;
    private final String f;

    public cvxx(Context context, boolean z, boolean z2, ekgb ekgbVar) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = ekgbVar;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.e = string;
        String string2 = context.getString(R.string.encryption_status_details_on_group_v3, string);
        string2.getClass();
        this.f = string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cvxp
    public final cvxw a() throws Resources.NotFoundException {
        String string;
        String string2;
        if (this.b) {
            return new cvxw(1, this.f);
        }
        if (!this.c) {
            ekgb ekgbVar = this.d;
            int size = ekgbVar.size();
            if (size == 0) {
                string = this.a.getString(R.string.encryption_status_self_group, this.e);
            } else if (size != 1) {
                Context context = this.a;
                int size2 = ekgbVar.size();
                string = context.getResources().getQuantityString(R.plurals.encryption_status_self_and_other_users_group, size2, Integer.valueOf(size2), this.e);
            } else {
                string = this.a.getResources().getQuantityString(R.plurals.encryption_status_self_and_other_users_group, 1, (String) ekgbVar.get(0), this.e);
            }
            string.getClass();
            return new cvxw(2, string);
        }
        ekgb ekgbVar2 = this.d;
        int size3 = ekgbVar2.size();
        if (size3 == 0) {
            string2 = null;
        } else if (size3 == 1) {
            string2 = this.a.getString(R.string.encryption_status_user_group, (String) ekgbVar2.get(0), this.e);
        } else if (size3 != 2) {
            String str = (String) ekgbVar2.get(0);
            int size4 = ekgbVar2.size() - 1;
            string2 = this.a.getResources().getQuantityString(R.plurals.encryption_status_user_and_other_users_group, size4, str, Integer.valueOf(size4), this.e);
        } else {
            string2 = this.a.getResources().getQuantityString(R.plurals.encryption_status_user_and_other_users_group, 1, (String) ekgbVar2.get(0), (String) ekgbVar2.get(1), this.e);
        }
        return new cvxw(2, string2);
    }
}
