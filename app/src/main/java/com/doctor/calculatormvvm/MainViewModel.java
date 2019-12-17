package com.doctor.calculatormvvm;

class MainViewModel {
    private final BangunModel bangunModel;

    MainViewModel(BangunModel bangunModel) {
        this.bangunModel = bangunModel;
    }

    void save(double l, double w, double h) {
        bangunModel.save(l, w, h);
    }
    double getCircumference() {
        return bangunModel.getCircumference();
    }
    double getSurfaceArea() {
        return bangunModel.getSurfaceArea();
    }
    double getVolume() {
        return bangunModel.getVolume();
    }
}
