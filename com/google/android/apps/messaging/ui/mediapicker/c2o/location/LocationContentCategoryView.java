package com.google.android.apps.messaging.ui.mediapicker.c2o.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.maps.MapView;
import defpackage.cvjo;
import defpackage.czdd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationContentCategoryView extends czdd {
    public cvjo a;
    private MapView b;
    private View c;

    public LocationContentCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.location_content_text_bubble);
        findViewById(R.id.location_category_permission_view);
        MapView mapView = (MapView) findViewById(R.id.location_content_map_view);
        this.b = mapView;
        mapView.setClickable(false);
        findViewById(R.id.location_content_map_loading_indicator);
        View viewFindViewById = findViewById(R.id.location_content_map_touch_target);
        this.c = viewFindViewById;
        viewFindViewById.setOnClickListener(this.a.a(new View.OnClickListener() { // from class: czdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                throw null;
            }
        }));
        setClipToOutline(true);
    }
}
