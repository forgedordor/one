package com.google.android.libraries.messaging.lighter.ui.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
import defpackage.dwye;
import defpackage.dxda;
import defpackage.ejud;
import defpackage.ejwi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessageListView extends PagedRecyclerView implements dwye {
    public ejwi ad;

    public MessageListView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = ejud.a;
        am(new dxda(context));
    }
}
