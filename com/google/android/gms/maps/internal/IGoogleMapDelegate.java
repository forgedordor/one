package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICancelableCallback;
import com.google.android.gms.maps.internal.IInfoWindowAdapter;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.IOnCameraChangeListener;
import com.google.android.gms.maps.internal.IOnCameraIdleListener;
import com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener;
import com.google.android.gms.maps.internal.IOnCameraMoveListener;
import com.google.android.gms.maps.internal.IOnCameraMoveStartedListener;
import com.google.android.gms.maps.internal.IOnCircleClickListener;
import com.google.android.gms.maps.internal.IOnGroundOverlayClickListener;
import com.google.android.gms.maps.internal.IOnIndoorStateChangeListener;
import com.google.android.gms.maps.internal.IOnInfoWindowClickListener;
import com.google.android.gms.maps.internal.IOnInfoWindowCloseListener;
import com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener;
import com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener;
import com.google.android.gms.maps.internal.IOnMapClickListener;
import com.google.android.gms.maps.internal.IOnMapLoadedCallback;
import com.google.android.gms.maps.internal.IOnMapLongClickListener;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;
import com.google.android.gms.maps.internal.IOnMarkerClickListener;
import com.google.android.gms.maps.internal.IOnMarkerDragListener;
import com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener;
import com.google.android.gms.maps.internal.IOnMyLocationChangeListener;
import com.google.android.gms.maps.internal.IOnMyLocationClickListener;
import com.google.android.gms.maps.internal.IOnPoiClickListener;
import com.google.android.gms.maps.internal.IOnPolygonClickListener;
import com.google.android.gms.maps.internal.IOnPolylineClickListener;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.ISnapshotReadyCallback;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.ICircleDelegate;
import com.google.android.gms.maps.model.internal.IFeatureLayerDelegate;
import com.google.android.gms.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import com.google.android.gms.maps.model.internal.IPolygonDelegate;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.ITileOverlayDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleMapDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleMapDelegate {
        static final int TRANSACTION_addCircle = 35;
        static final int TRANSACTION_addGroundOverlay = 12;
        static final int TRANSACTION_addMarker = 11;
        static final int TRANSACTION_addOnMapCapabilitiesChangedListener = 110;
        static final int TRANSACTION_addPolygon = 10;
        static final int TRANSACTION_addPolyline = 9;
        static final int TRANSACTION_addTileOverlay = 13;
        static final int TRANSACTION_animateCamera = 5;
        static final int TRANSACTION_animateCameraWithCallback = 6;
        static final int TRANSACTION_animateCameraWithDurationAndCallback = 7;
        static final int TRANSACTION_clear = 14;
        static final int TRANSACTION_getCameraPosition = 1;
        static final int TRANSACTION_getDebugString = 115;
        static final int TRANSACTION_getFeatureLayer = 112;
        static final int TRANSACTION_getFocusedBuilding = 44;
        static final int TRANSACTION_getMapAsync = 53;
        static final int TRANSACTION_getMapCapabilities = 109;
        static final int TRANSACTION_getMapColorScheme = 114;
        static final int TRANSACTION_getMapType = 15;
        static final int TRANSACTION_getMaxZoomLevel = 2;
        static final int TRANSACTION_getMinZoomLevel = 3;
        static final int TRANSACTION_getMyLocation = 23;
        static final int TRANSACTION_getProjection = 26;
        static final int TRANSACTION_getUiSettings = 25;
        static final int TRANSACTION_isBuildingsEnabled = 40;
        static final int TRANSACTION_isIndoorEnabled = 19;
        static final int TRANSACTION_isMyLocationEnabled = 21;
        static final int TRANSACTION_isTrafficEnabled = 17;
        static final int TRANSACTION_moveCamera = 4;
        static final int TRANSACTION_onCreate = 54;
        static final int TRANSACTION_onDestroy = 57;
        static final int TRANSACTION_onEnterAmbient = 81;
        static final int TRANSACTION_onExitAmbient = 82;
        static final int TRANSACTION_onLowMemory = 58;
        static final int TRANSACTION_onPause = 56;
        static final int TRANSACTION_onResume = 55;
        static final int TRANSACTION_onSaveInstanceState = 60;
        static final int TRANSACTION_onStart = 101;
        static final int TRANSACTION_onStop = 102;
        static final int TRANSACTION_removeOnMapCapabilitiesChangedListener = 111;
        static final int TRANSACTION_resetMinMaxZoomPreference = 94;
        static final int TRANSACTION_setBuildingsEnabled = 41;
        static final int TRANSACTION_setContentDescription = 61;
        static final int TRANSACTION_setIndoorEnabled = 20;
        static final int TRANSACTION_setInfoWindowAdapter = 33;
        static final int TRANSACTION_setLatLngBoundsForCameraTarget = 95;
        static final int TRANSACTION_setLocationSource = 24;
        static final int TRANSACTION_setMapColorScheme = 113;
        static final int TRANSACTION_setMapStyle = 91;
        static final int TRANSACTION_setMapType = 16;
        static final int TRANSACTION_setMaxZoomPreference = 93;
        static final int TRANSACTION_setMinZoomPreference = 92;
        static final int TRANSACTION_setMyLocationEnabled = 22;
        static final int TRANSACTION_setOnCameraChangeListener = 27;
        static final int TRANSACTION_setOnCameraIdleListener = 99;
        static final int TRANSACTION_setOnCameraMoveCanceledListener = 98;
        static final int TRANSACTION_setOnCameraMoveListener = 97;
        static final int TRANSACTION_setOnCameraMoveStartedListener = 96;
        static final int TRANSACTION_setOnCircleClickListener = 89;
        static final int TRANSACTION_setOnGroundOverlayClickListener = 83;
        static final int TRANSACTION_setOnIndoorStateChangeListener = 45;
        static final int TRANSACTION_setOnInfoWindowClickListener = 32;
        static final int TRANSACTION_setOnInfoWindowCloseListener = 86;
        static final int TRANSACTION_setOnInfoWindowLongClickListener = 84;
        static final int TRANSACTION_setOnMapClickListener = 28;
        static final int TRANSACTION_setOnMapLoadedCallback = 42;
        static final int TRANSACTION_setOnMapLongClickListener = 29;
        static final int TRANSACTION_setOnMarkerClickListener = 30;
        static final int TRANSACTION_setOnMarkerDragListener = 31;
        static final int TRANSACTION_setOnMyLocationButtonClickListener = 37;
        static final int TRANSACTION_setOnMyLocationChangeListener = 36;
        static final int TRANSACTION_setOnMyLocationClickListener = 107;
        static final int TRANSACTION_setOnPoiClickListener = 80;
        static final int TRANSACTION_setOnPolygonClickListener = 85;
        static final int TRANSACTION_setOnPolylineClickListener = 87;
        static final int TRANSACTION_setPadding = 39;
        static final int TRANSACTION_setTrafficEnabled = 18;
        static final int TRANSACTION_setWatermarkEnabled = 51;
        static final int TRANSACTION_snapshot = 38;
        static final int TRANSACTION_snapshotForTest = 71;
        static final int TRANSACTION_stopAnimation = 8;
        static final int TRANSACTION_useViewLifecycleWhenInFragment = 59;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleMapDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public ICircleDelegate addCircle(CircleOptions circleOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, circleOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(35, parcelObtainAndWriteInterfaceToken);
                ICircleDelegate iCircleDelegateAsInterface = ICircleDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCircleDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, groundOverlayOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = IGroundOverlayDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iGroundOverlayDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IMarkerDelegate addMarker(MarkerOptions markerOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, markerOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMarkerDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void addOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapCapabilitiesChangedListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addOnMapCapabilitiesChangedListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolygonDelegate addPolygon(PolygonOptions polygonOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, polygonOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                IPolygonDelegate iPolygonDelegateAsInterface = IPolygonDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iPolygonDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolylineDelegate addPolyline(PolylineOptions polylineOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, polylineOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                IPolylineDelegate iPolylineDelegateAsInterface = IPolylineDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iPolylineDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, tileOverlayOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(13, parcelObtainAndWriteInterfaceToken);
                ITileOverlayDelegate iTileOverlayDelegateAsInterface = ITileOverlayDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTileOverlayDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback(IObjectWrapper iObjectWrapper, ICancelableCallback iCancelableCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iCancelableCallback);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, ICancelableCallback iCancelableCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iCancelableCallback);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void clear() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public CameraPosition getCameraPosition() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                CameraPosition cameraPosition = (CameraPosition) sgh.a(parcelTransactAndReadException, CameraPosition.CREATOR);
                parcelTransactAndReadException.recycle();
                return cameraPosition;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public String getDebugString(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getDebugString, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IFeatureLayerDelegate getFeatureLayer(FeatureLayerOptions featureLayerOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, featureLayerOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getFeatureLayer, parcelObtainAndWriteInterfaceToken);
                IFeatureLayerDelegate iFeatureLayerDelegateAsInterface = IFeatureLayerDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iFeatureLayerDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IIndoorBuildingDelegate getFocusedBuilding() {
                Parcel parcelTransactAndReadException = transactAndReadException(44, obtainAndWriteInterfaceToken());
                IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = IIndoorBuildingDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iIndoorBuildingDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapReadyCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getMapAsync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IMapCapabilitiesDelegate getMapCapabilities() {
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getMapCapabilities, obtainAndWriteInterfaceToken());
                IMapCapabilitiesDelegate iMapCapabilitiesDelegateAsInterface = IMapCapabilitiesDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMapCapabilitiesDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapColorScheme() {
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getMapColorScheme, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapType() {
                Parcel parcelTransactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMaxZoomLevel() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMinZoomLevel() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public Location getMyLocation() {
                Parcel parcelTransactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                Location location = (Location) sgh.a(parcelTransactAndReadException, Location.CREATOR);
                parcelTransactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IProjectionDelegate getProjection() {
                Parcel parcelTransactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                IProjectionDelegate iProjectionDelegateAsInterface = IProjectionDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iProjectionDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IUiSettingsDelegate getUiSettings() {
                Parcel parcelTransactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
                IUiSettingsDelegate iUiSettingsDelegateAsInterface = IUiSettingsDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iUiSettingsDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isBuildingsEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(40, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isIndoorEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isMyLocationEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isTrafficEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onCreate(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onCreate, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onDestroy, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onEnterAmbient(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onEnterAmbient, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onExitAmbient() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onExitAmbient, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onLowMemory() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onLowMemory, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onPause, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onResume, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_onSaveInstanceState, parcelObtainAndWriteInterfaceToken);
                if (parcelTransactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(parcelTransactAndReadException);
                }
                parcelTransactAndReadException.recycle();
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onStop, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void removeOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapCapabilitiesChangedListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeOnMapCapabilitiesChangedListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void resetMinMaxZoomPreference() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_resetMinMaxZoomPreference, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setBuildingsEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(41, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setContentDescription(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setContentDescription, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setIndoorEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iInfoWindowAdapter);
                transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLngBounds);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setLatLngBoundsForCameraTarget, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationSourceDelegate);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapColorScheme(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMapColorScheme, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setMapStyle(MapStyleOptions mapStyleOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, mapStyleOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_setMapStyle, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapType(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMaxZoomPreference(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMaxZoomPreference, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMinZoomPreference(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMinZoomPreference, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMyLocationEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCameraChangeListener);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCameraIdleListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraIdleListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCameraMoveCanceledListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraMoveCanceledListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCameraMoveListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraMoveListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCameraMoveStartedListener);
                transactAndReadExceptionReturnVoid(96, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCircleClickListener(IOnCircleClickListener iOnCircleClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnCircleClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCircleClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnGroundOverlayClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnGroundOverlayClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnIndoorStateChangeListener);
                transactAndReadExceptionReturnVoid(45, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnInfoWindowClickListener);
                transactAndReadExceptionReturnVoid(32, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnInfoWindowCloseListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnInfoWindowCloseListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnInfoWindowLongClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnInfoWindowLongClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapClickListener(IOnMapClickListener iOnMapClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapClickListener);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapLoadedCallback);
                transactAndReadExceptionReturnVoid(42, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMapLongClickListener);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMarkerClickListener);
                transactAndReadExceptionReturnVoid(30, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMarkerDragListener);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMyLocationButtonClickListener);
                transactAndReadExceptionReturnVoid(37, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMyLocationChangeListener);
                transactAndReadExceptionReturnVoid(36, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnMyLocationClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnMyLocationClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnPoiClickListener);
                transactAndReadExceptionReturnVoid(80, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnPolygonClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnPolygonClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnPolylineClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnPolylineClickListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setPadding(int i, int i2, int i3, int i4) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeInt(i4);
                transactAndReadExceptionReturnVoid(39, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setTrafficEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setWatermarkEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setWatermarkEnabled, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSnapshotReadyCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(38, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSnapshotReadyCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_snapshotForTest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void stopAnimation() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean useViewLifecycleWhenInFragment() {
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_useViewLifecycleWhenInFragment, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        }

        public static IGoogleMapDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return iInterfaceQueryLocalInterface instanceof IGoogleMapDelegate ? (IGoogleMapDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 44) {
                IIndoorBuildingDelegate focusedBuilding = getFocusedBuilding();
                parcel2.writeNoException();
                sgh.f(parcel2, focusedBuilding);
                return true;
            }
            if (i == 45) {
                IOnIndoorStateChangeListener iOnIndoorStateChangeListenerAsInterface = IOnIndoorStateChangeListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                setOnIndoorStateChangeListener(iOnIndoorStateChangeListenerAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_setWatermarkEnabled) {
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                setWatermarkEnabled(zG);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_snapshotForTest) {
                ISnapshotReadyCallback iSnapshotReadyCallbackAsInterface = ISnapshotReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                snapshotForTest(iSnapshotReadyCallbackAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_setOnCircleClickListener) {
                IOnCircleClickListener iOnCircleClickListenerAsInterface = IOnCircleClickListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                setOnCircleClickListener(iOnCircleClickListenerAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_setOnMyLocationClickListener) {
                IOnMyLocationClickListener iOnMyLocationClickListenerAsInterface = IOnMyLocationClickListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                setOnMyLocationClickListener(iOnMyLocationClickListenerAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 101) {
                onStart();
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_onStop) {
                onStop();
                parcel2.writeNoException();
                return true;
            }
            switch (i) {
                case 1:
                    CameraPosition cameraPosition = getCameraPosition();
                    parcel2.writeNoException();
                    sgh.e(parcel2, cameraPosition);
                    return true;
                case 2:
                    float maxZoomLevel = getMaxZoomLevel();
                    parcel2.writeNoException();
                    parcel2.writeFloat(maxZoomLevel);
                    return true;
                case 3:
                    float minZoomLevel = getMinZoomLevel();
                    parcel2.writeNoException();
                    parcel2.writeFloat(minZoomLevel);
                    return true;
                case 4:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    moveCamera(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    animateCamera(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    ICancelableCallback iCancelableCallbackAsInterface = ICancelableCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    animateCameraWithCallback(iObjectWrapperAsInterface3, iCancelableCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    ICancelableCallback iCancelableCallbackAsInterface2 = ICancelableCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    animateCameraWithDurationAndCallback(iObjectWrapperAsInterface4, i3, iCancelableCallbackAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    stopAnimation();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    PolylineOptions polylineOptions = (PolylineOptions) sgh.a(parcel, PolylineOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IPolylineDelegate iPolylineDelegateAddPolyline = addPolyline(polylineOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iPolylineDelegateAddPolyline);
                    return true;
                case 10:
                    PolygonOptions polygonOptions = (PolygonOptions) sgh.a(parcel, PolygonOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IPolygonDelegate iPolygonDelegateAddPolygon = addPolygon(polygonOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iPolygonDelegateAddPolygon);
                    return true;
                case 11:
                    MarkerOptions markerOptions = (MarkerOptions) sgh.a(parcel, MarkerOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMarkerDelegate iMarkerDelegateAddMarker = addMarker(markerOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iMarkerDelegateAddMarker);
                    return true;
                case 12:
                    GroundOverlayOptions groundOverlayOptions = (GroundOverlayOptions) sgh.a(parcel, GroundOverlayOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IGroundOverlayDelegate iGroundOverlayDelegateAddGroundOverlay = addGroundOverlay(groundOverlayOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iGroundOverlayDelegateAddGroundOverlay);
                    return true;
                case 13:
                    TileOverlayOptions tileOverlayOptions = (TileOverlayOptions) sgh.a(parcel, TileOverlayOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITileOverlayDelegate iTileOverlayDelegateAddTileOverlay = addTileOverlay(tileOverlayOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iTileOverlayDelegateAddTileOverlay);
                    return true;
                case 14:
                    clear();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    int mapType = getMapType();
                    parcel2.writeNoException();
                    parcel2.writeInt(mapType);
                    return true;
                case 16:
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setMapType(i4);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    boolean zIsTrafficEnabled = isTrafficEnabled();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsTrafficEnabled ? 1 : 0);
                    return true;
                case 18:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setTrafficEnabled(zG2);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    boolean zIsIndoorEnabled = isIndoorEnabled();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsIndoorEnabled ? 1 : 0);
                    return true;
                case 20:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    boolean indoorEnabled = setIndoorEnabled(zG3);
                    parcel2.writeNoException();
                    parcel2.writeInt(indoorEnabled ? 1 : 0);
                    return true;
                case 21:
                    boolean zIsMyLocationEnabled = isMyLocationEnabled();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsMyLocationEnabled ? 1 : 0);
                    return true;
                case 22:
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMyLocationEnabled(zG4);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    Location myLocation = getMyLocation();
                    parcel2.writeNoException();
                    sgh.e(parcel2, myLocation);
                    return true;
                case 24:
                    ILocationSourceDelegate iLocationSourceDelegateAsInterface = ILocationSourceDelegate.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setLocationSource(iLocationSourceDelegateAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    IUiSettingsDelegate uiSettings = getUiSettings();
                    parcel2.writeNoException();
                    sgh.f(parcel2, uiSettings);
                    return true;
                case 26:
                    IProjectionDelegate projection = getProjection();
                    parcel2.writeNoException();
                    sgh.f(parcel2, projection);
                    return true;
                case 27:
                    IOnCameraChangeListener iOnCameraChangeListenerAsInterface = IOnCameraChangeListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnCameraChangeListener(iOnCameraChangeListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    IOnMapClickListener iOnMapClickListenerAsInterface = IOnMapClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnMapClickListener(iOnMapClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 29:
                    IOnMapLongClickListener iOnMapLongClickListenerAsInterface = IOnMapLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnMapLongClickListener(iOnMapLongClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    IOnMarkerClickListener iOnMarkerClickListenerAsInterface = IOnMarkerClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnMarkerClickListener(iOnMarkerClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 31:
                    IOnMarkerDragListener iOnMarkerDragListenerAsInterface = IOnMarkerDragListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnMarkerDragListener(iOnMarkerDragListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    IOnInfoWindowClickListener iOnInfoWindowClickListenerAsInterface = IOnInfoWindowClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnInfoWindowClickListener(iOnInfoWindowClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 33:
                    IInfoWindowAdapter iInfoWindowAdapterAsInterface = IInfoWindowAdapter.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setInfoWindowAdapter(iInfoWindowAdapterAsInterface);
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 35:
                            CircleOptions circleOptions = (CircleOptions) sgh.a(parcel, CircleOptions.CREATOR);
                            enforceNoDataAvail(parcel);
                            ICircleDelegate iCircleDelegateAddCircle = addCircle(circleOptions);
                            parcel2.writeNoException();
                            sgh.f(parcel2, iCircleDelegateAddCircle);
                            return true;
                        case 36:
                            IOnMyLocationChangeListener iOnMyLocationChangeListenerAsInterface = IOnMyLocationChangeListener.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            setOnMyLocationChangeListener(iOnMyLocationChangeListenerAsInterface);
                            parcel2.writeNoException();
                            return true;
                        case 37:
                            IOnMyLocationButtonClickListener iOnMyLocationButtonClickListenerAsInterface = IOnMyLocationButtonClickListener.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            setOnMyLocationButtonClickListener(iOnMyLocationButtonClickListenerAsInterface);
                            parcel2.writeNoException();
                            return true;
                        case 38:
                            ISnapshotReadyCallback iSnapshotReadyCallbackAsInterface2 = ISnapshotReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                            IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            snapshot(iSnapshotReadyCallbackAsInterface2, iObjectWrapperAsInterface5);
                            parcel2.writeNoException();
                            return true;
                        case 39:
                            int i8 = parcel.readInt();
                            int i9 = parcel.readInt();
                            int i10 = parcel.readInt();
                            int i11 = parcel.readInt();
                            enforceNoDataAvail(parcel);
                            setPadding(i8, i9, i10, i11);
                            parcel2.writeNoException();
                            return true;
                        case 40:
                            boolean zIsBuildingsEnabled = isBuildingsEnabled();
                            parcel2.writeNoException();
                            int i12 = sgh.a;
                            parcel2.writeInt(zIsBuildingsEnabled ? 1 : 0);
                            return true;
                        case 41:
                            boolean zG5 = sgh.g(parcel);
                            enforceNoDataAvail(parcel);
                            setBuildingsEnabled(zG5);
                            parcel2.writeNoException();
                            return true;
                        case 42:
                            IOnMapLoadedCallback iOnMapLoadedCallbackAsInterface = IOnMapLoadedCallback.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            setOnMapLoadedCallback(iOnMapLoadedCallbackAsInterface);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case TRANSACTION_getMapAsync /* 53 */:
                                    IOnMapReadyCallback iOnMapReadyCallbackAsInterface = IOnMapReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                                    enforceNoDataAvail(parcel);
                                    getMapAsync(iOnMapReadyCallbackAsInterface);
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_onCreate /* 54 */:
                                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    onCreate(bundle);
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_onResume /* 55 */:
                                    onResume();
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_onPause /* 56 */:
                                    onPause();
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_onDestroy /* 57 */:
                                    onDestroy();
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_onLowMemory /* 58 */:
                                    onLowMemory();
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_useViewLifecycleWhenInFragment /* 59 */:
                                    boolean zUseViewLifecycleWhenInFragment = useViewLifecycleWhenInFragment();
                                    parcel2.writeNoException();
                                    int i13 = sgh.a;
                                    parcel2.writeInt(zUseViewLifecycleWhenInFragment ? 1 : 0);
                                    return true;
                                case TRANSACTION_onSaveInstanceState /* 60 */:
                                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    onSaveInstanceState(bundle2);
                                    parcel2.writeNoException();
                                    sgh.e(parcel2, bundle2);
                                    return true;
                                case TRANSACTION_setContentDescription /* 61 */:
                                    String string = parcel.readString();
                                    enforceNoDataAvail(parcel);
                                    setContentDescription(string);
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i) {
                                        case 80:
                                            IOnPoiClickListener iOnPoiClickListenerAsInterface = IOnPoiClickListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnPoiClickListener(iOnPoiClickListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_onEnterAmbient /* 81 */:
                                            Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            onEnterAmbient(bundle3);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_onExitAmbient /* 82 */:
                                            onExitAmbient();
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_setOnGroundOverlayClickListener /* 83 */:
                                            IOnGroundOverlayClickListener iOnGroundOverlayClickListenerAsInterface = IOnGroundOverlayClickListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnGroundOverlayClickListener(iOnGroundOverlayClickListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_setOnInfoWindowLongClickListener /* 84 */:
                                            IOnInfoWindowLongClickListener iOnInfoWindowLongClickListenerAsInterface = IOnInfoWindowLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnInfoWindowLongClickListener(iOnInfoWindowLongClickListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_setOnPolygonClickListener /* 85 */:
                                            IOnPolygonClickListener iOnPolygonClickListenerAsInterface = IOnPolygonClickListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnPolygonClickListener(iOnPolygonClickListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_setOnInfoWindowCloseListener /* 86 */:
                                            IOnInfoWindowCloseListener iOnInfoWindowCloseListenerAsInterface = IOnInfoWindowCloseListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnInfoWindowCloseListener(iOnInfoWindowCloseListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_setOnPolylineClickListener /* 87 */:
                                            IOnPolylineClickListener iOnPolylineClickListenerAsInterface = IOnPolylineClickListener.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            setOnPolylineClickListener(iOnPolylineClickListenerAsInterface);
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case TRANSACTION_setMapStyle /* 91 */:
                                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) sgh.a(parcel, MapStyleOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    boolean mapStyle = setMapStyle(mapStyleOptions);
                                                    parcel2.writeNoException();
                                                    parcel2.writeInt(mapStyle ? 1 : 0);
                                                    return true;
                                                case TRANSACTION_setMinZoomPreference /* 92 */:
                                                    float f = parcel.readFloat();
                                                    enforceNoDataAvail(parcel);
                                                    setMinZoomPreference(f);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_setMaxZoomPreference /* 93 */:
                                                    float f2 = parcel.readFloat();
                                                    enforceNoDataAvail(parcel);
                                                    setMaxZoomPreference(f2);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_resetMinMaxZoomPreference /* 94 */:
                                                    resetMinMaxZoomPreference();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_setLatLngBoundsForCameraTarget /* 95 */:
                                                    LatLngBounds latLngBounds = (LatLngBounds) sgh.a(parcel, LatLngBounds.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    setLatLngBoundsForCameraTarget(latLngBounds);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 96:
                                                    IOnCameraMoveStartedListener iOnCameraMoveStartedListenerAsInterface = IOnCameraMoveStartedListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnCameraMoveStartedListener(iOnCameraMoveStartedListenerAsInterface);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_setOnCameraMoveListener /* 97 */:
                                                    IOnCameraMoveListener iOnCameraMoveListenerAsInterface = IOnCameraMoveListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnCameraMoveListener(iOnCameraMoveListenerAsInterface);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_setOnCameraMoveCanceledListener /* 98 */:
                                                    IOnCameraMoveCanceledListener iOnCameraMoveCanceledListenerAsInterface = IOnCameraMoveCanceledListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnCameraMoveCanceledListener(iOnCameraMoveCanceledListenerAsInterface);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_setOnCameraIdleListener /* 99 */:
                                                    IOnCameraIdleListener iOnCameraIdleListenerAsInterface = IOnCameraIdleListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnCameraIdleListener(iOnCameraIdleListenerAsInterface);
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case TRANSACTION_getMapCapabilities /* 109 */:
                                                            IMapCapabilitiesDelegate mapCapabilities = getMapCapabilities();
                                                            parcel2.writeNoException();
                                                            sgh.f(parcel2, mapCapabilities);
                                                            return true;
                                                        case TRANSACTION_addOnMapCapabilitiesChangedListener /* 110 */:
                                                            IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListenerAsInterface = IOnMapCapabilitiesChangedListener.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            addOnMapCapabilitiesChangedListener(iOnMapCapabilitiesChangedListenerAsInterface);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_removeOnMapCapabilitiesChangedListener /* 111 */:
                                                            IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListenerAsInterface2 = IOnMapCapabilitiesChangedListener.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            removeOnMapCapabilitiesChangedListener(iOnMapCapabilitiesChangedListenerAsInterface2);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_getFeatureLayer /* 112 */:
                                                            FeatureLayerOptions featureLayerOptions = (FeatureLayerOptions) sgh.a(parcel, FeatureLayerOptions.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            IFeatureLayerDelegate featureLayer = getFeatureLayer(featureLayerOptions);
                                                            parcel2.writeNoException();
                                                            sgh.f(parcel2, featureLayer);
                                                            return true;
                                                        case TRANSACTION_setMapColorScheme /* 113 */:
                                                            int i14 = parcel.readInt();
                                                            enforceNoDataAvail(parcel);
                                                            setMapColorScheme(i14);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_getMapColorScheme /* 114 */:
                                                            int mapColorScheme = getMapColorScheme();
                                                            parcel2.writeNoException();
                                                            parcel2.writeInt(mapColorScheme);
                                                            return true;
                                                        case TRANSACTION_getDebugString /* 115 */:
                                                            String string2 = parcel.readString();
                                                            enforceNoDataAvail(parcel);
                                                            String debugString = getDebugString(string2);
                                                            parcel2.writeNoException();
                                                            parcel2.writeString(debugString);
                                                            return true;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    ICircleDelegate addCircle(CircleOptions circleOptions);

    IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    IMarkerDelegate addMarker(MarkerOptions markerOptions);

    void addOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener);

    IPolygonDelegate addPolygon(PolygonOptions polygonOptions);

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions);

    ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(IObjectWrapper iObjectWrapper);

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, ICancelableCallback iCancelableCallback);

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, ICancelableCallback iCancelableCallback);

    void clear();

    CameraPosition getCameraPosition();

    String getDebugString(String str);

    IFeatureLayerDelegate getFeatureLayer(FeatureLayerOptions featureLayerOptions);

    IIndoorBuildingDelegate getFocusedBuilding();

    void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback);

    IMapCapabilitiesDelegate getMapCapabilities();

    int getMapColorScheme();

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    Location getMyLocation();

    IProjectionDelegate getProjection();

    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(IObjectWrapper iObjectWrapper);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void removeOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener);

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z);

    void setContentDescription(String str);

    boolean setIndoorEnabled(boolean z);

    void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter);

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds);

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate);

    void setMapColorScheme(int i);

    boolean setMapStyle(MapStyleOptions mapStyleOptions);

    void setMapType(int i);

    void setMaxZoomPreference(float f);

    void setMinZoomPreference(float f);

    void setMyLocationEnabled(boolean z);

    void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener);

    void setOnCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener);

    void setOnCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener);

    void setOnCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener);

    void setOnCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener);

    void setOnCircleClickListener(IOnCircleClickListener iOnCircleClickListener);

    void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener);

    void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener);

    void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener);

    void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener);

    void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener);

    void setOnMapClickListener(IOnMapClickListener iOnMapClickListener);

    void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback);

    void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener);

    void setOnMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener);

    void setOnMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener);

    void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener);

    void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener);

    void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener);

    void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener);

    void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener);

    void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener);

    void setPadding(int i, int i2, int i3, int i4);

    void setTrafficEnabled(boolean z);

    void setWatermarkEnabled(boolean z);

    void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper);

    void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback);

    void stopAnimation();

    boolean useViewLifecycleWhenInFragment();
}
